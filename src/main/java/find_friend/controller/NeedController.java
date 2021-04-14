package find_friend.controller;

import com.sun.xml.internal.rngom.parse.host.Base;
import find_friend.po.Need;
import find_friend.po.ResultModel;
import find_friend.repository.NeedRepository;
import find_friend.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by mengwei on 2018/4/12.
 */
@RestController
@RequestMapping("need")
public class NeedController extends BaseController{
    @Autowired
    private NeedRepository needRepository;

    //获取单个需求
    @GetMapping(value = "/getNeed")
    public Need getNeed(String needid){
        return needRepository.findByNeedid(needid);
    }

    //发布需求
    @PostMapping(value = "/release")
    public String release(HttpServletRequest request, Need need) throws ServletException {
        if (getUserSession(request)==null){
            return null;
        }
        need.setNeedid(UUID.randomUUID().toString().replaceAll("-", ""));
        need.setSubmitted(Byte.parseByte("1"));
        need.setCreatetime(new Date());
        need.setCreateuserid(getUserSession(request).getUserid());
        needRepository.save(need);
        return need.getNeedid();
    }

    //创建草稿
    @PostMapping(value = "/releaseUndo")
    public ResponseEntity<ResultModel> releaseUndo(HttpServletRequest request, Need need) throws ServletException {
        if (getUserSession(request)==null){
            return new ResponseEntity<>(ResultModel.error(HttpStatus.BAD_GATEWAY,"用户未登录"), HttpStatus.BAD_GATEWAY);
        }
        need.setNeedid(UUID.randomUUID().toString().replaceAll("-", ""));
        need.setSubmitted(Byte.parseByte("0"));
        need.setCreatetime(new Date());
        need.setCreateuserid(getUserSession(request).getUserid());
        need.setFirstTag(need.getFirstTag());
        need.setSecondTag(need.getSecondTag());
        needRepository.save(need);
        return new ResponseEntity<>(ResultModel.ok("草稿保存成功"), HttpStatus.OK);
    }

    //草稿转换为需求
    @PostMapping(value = "/publicUndo")
    public ResponseEntity<ResultModel> publicUndo(HttpServletRequest request, String needid){
        Need need = needRepository.findByNeedid(needid);
        if(need.getSubmitted().equals(Byte.valueOf("0"))){
            need.setSubmitted(Byte.parseByte("1"));
            return new ResponseEntity<>(ResultModel.ok("需求发布成功"), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(ResultModel.error(HttpStatus.BAD_GATEWAY,"该草稿不存在"), HttpStatus.BAD_GATEWAY);
        }
    }

    //修改草稿
    @PostMapping(value = "/changeUndo")
    public ResponseEntity<ResultModel> changeUndo(String needid,Need newNeed){
        Need need = needRepository.findByNeedid(needid);
        if(need.getSubmitted().equals(Byte.valueOf("0"))){
            if(newNeed.getDdl() != null) {
                need.setDdl(newNeed.getDdl());
            }
            if(newNeed.getDetail() != null) {
                need.setDetail(newNeed.getDetail());
            }
            if(newNeed.getFirstTag() != null) {
                need.setFirstTag(newNeed.getFirstTag());
            }
            if(newNeed.getMaxcount() != null){
                need.setMaxcount(newNeed.getMaxcount());
            }
            if(newNeed.getSecondTag() != null) {
                need.setSecondTag(newNeed.getSecondTag());
            }
            needRepository.save(need);
            return new ResponseEntity<>(ResultModel.ok("草稿修改成功"), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(ResultModel.error(HttpStatus.BAD_GATEWAY,"该草稿不存在"), HttpStatus.BAD_GATEWAY);
        }
    }

    //获取全部草稿
    @GetMapping(value = "/getAllUndo")
    public List<Need> getAllUndo(HttpServletRequest request){
        String userid = getUserSession(request).getUserid();
        List<Need> needs = needRepository.findByCreateuserid(userid);
        List<Need> undos = new ArrayList<>();
        for(Need need: needs){
            if(need.getSubmitted() == Byte.valueOf("0")){
                undos.add(need);
            }
        }
        return undos;
    }

}
