package find_friend.controller;

import com.sun.xml.internal.rngom.parse.host.Base;
import find_friend.po.Need;
import find_friend.po.ResultModel;
import find_friend.repository.NeedRepository;
import find_friend.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.UUID;

/**
 * Created by mengwei on 2018/4/12.
 */
@RestController
@RequestMapping("need")
public class NeedController extends BaseController{
    @Autowired
    private NeedRepository needRepository;

    @PostMapping(value = "/release")
    public ResponseEntity<ResultModel> release(HttpServletRequest request, Need need) throws ServletException {
        if (getUserSession(request)==null){
            return new ResponseEntity<>(ResultModel.error(HttpStatus.BAD_GATEWAY,"用户未登录"), HttpStatus.BAD_GATEWAY);
        }
        need.setNeedid(UUID.randomUUID().toString().replaceAll("-", ""));
        need.setSubmitted(Byte.parseByte("0"));
        //need.setCreatetime(new Date());
        need.setCreateuserid(getUserSession(request).getUserid());
        needRepository.save(need);
        return new ResponseEntity<>(ResultModel.ok("需求发布成功"), HttpStatus.OK);
    }
}
