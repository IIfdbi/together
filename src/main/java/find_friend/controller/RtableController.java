package find_friend.controller;

import find_friend.po.Need;
import find_friend.po.RtableUser;
import find_friend.po.ResultModel;
import find_friend.po.Rtable;
import find_friend.repository.NeedRepository;
import find_friend.repository.RtableRepository;
import find_friend.repository.RtableUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by mengwei on 2018/4/22.
 */
@RestController
@RequestMapping("rtable")
public class RtableController extends BaseController{
    @Autowired
    private RtableRepository rtableRepository;

    @Autowired
    private NeedRepository needRepository;

    @Autowired
    private RtableUserRepository rtableUserRepository;

    //需求转换圆桌
    @PostMapping(value = "/create")
    public ResponseEntity<ResultModel> createRTable(String needid,String RTablename,HttpServletRequest request){
        Need need = needRepository.findByNeedid(needid);
        if(need == null){
            return new ResponseEntity<>(ResultModel.error(HttpStatus.BAD_REQUEST,"非法的需求"), HttpStatus.BAD_REQUEST);
        }
        Rtable RTable = new Rtable();
        RTable.setRtableid(UUID.randomUUID().toString().replaceAll("-", ""));
        RTable.setMaxNumber(need.getMaxcount());
        RTable.setAvailable(Byte.parseByte("0"));
        RTable.setCreatetime(need.getCreatetime());
        RTable.setDdl(need.getDdl());
        RTable.setNeedid(needid);
        RTable.setDetail(need.getDetail());
        RTable.setSchool(need.getSchool());
        if(need.getSecondTag() == null) {
            RTable.setRtablename(RTablename);
        }
        else{
            RTable.setRtablename(RTablename);
        }
        rtableRepository.save(RTable);
        RtableUser ru = new RtableUser();
        ru.setUserid(getUserSession(request).getUserid());
        ru.setIdentity("0");
        ru.setJoined(Byte.parseByte("1"));
        ru.setJointime(new Date());
        ru.setReady(Byte.parseByte("0"));
        ru.setRtableid(RTable.getRtableid());
        ru.setRtablememberid(UUID.randomUUID().toString().replaceAll("-", ""));
        rtableUserRepository.save(ru);
        return new ResponseEntity<>(ResultModel.ok("圆桌创建成功"), HttpStatus.OK);
    }

    //参与圆桌
    @PostMapping(value = "/join")
    public ResponseEntity<ResultModel> joinRTable(HttpServletRequest request,String rtableid){
        Rtable rTable = rtableRepository.findByRtableid(rtableid);
        if(rTable == null){
            return new ResponseEntity<>(ResultModel.error(HttpStatus.BAD_REQUEST,"非法的圆桌"), HttpStatus.BAD_REQUEST);
        }
        RtableUser ru = new RtableUser();
        ru.setUserid(getUserSession(request).getUserid());
        ru.setIdentity("1");
        ru.setJoined(Byte.parseByte("1"));
        ru.setJointime(new Date());
        ru.setReady(Byte.parseByte("0"));
        ru.setRtableid(rTable.getRtableid());
        ru.setRtablememberid(UUID.randomUUID().toString().replaceAll("-", ""));
        rtableUserRepository.save(ru);
        return new ResponseEntity<>(ResultModel.ok("圆桌创建成功"), HttpStatus.OK);
    }

    //获取用户创建的所有圆桌
    @GetMapping(value = "/getUserCreateAll")
    public List<Rtable> getUserCreateAllRTable(HttpServletRequest request){
        String userid = getUserSession(request).getUserid();
        List<RtableUser> RTables = rtableUserRepository.findByUserid(userid);
        List<Rtable> userRTables = new ArrayList<>();
        for(RtableUser RTable : RTables){
            if(RTable.getIdentity().equals("0")){
                String RTableid = RTable.getRtableid();
                userRTables.add(rtableRepository.findByRtableid(RTableid));
            }
        }
        return userRTables;
    }

    //获取用户参与的所有圆桌
    @GetMapping(value = "/getUserAttendAll")
    public List<Rtable> getUserAttendAllRTable(HttpServletRequest request){
        String userid = getUserSession(request).getUserid();
        List<RtableUser> RTables = rtableUserRepository.findByUserid(userid);
        List<Rtable> userRTables = new ArrayList<>();
        for(RtableUser RTable : RTables){
            if(RTable.getIdentity().equals("1")){
                String RTableid = RTable.getRtableid();
                userRTables.add(rtableRepository.findByRtableid(RTableid));
            }
        }
        return userRTables;
    }

    //获取用户当前学校所有圆桌-创建时间排序
    @GetMapping(value = "/getSchoolRtablesByCT")
    public Page<Rtable> getSchoolRTableByCT(HttpServletRequest request){
        int page = 0,size = 10;
        Sort sort = new Sort(Sort.Direction.DESC,"createtime");
        Pageable pageable = new PageRequest(page,size,sort);
        String school = getUserSession(request).getSchool();
        Page<Rtable> RTables = rtableRepository.findBySchool(school,pageable);
        return RTables;
    }

    //获取用户当前学校所有圆桌-截止时间排序
    @GetMapping(value = "/getSchoolRtablesByDDL")
    public Page<Rtable> getSchoolRTableByDDL(HttpServletRequest request){
        int page = 0,size = 10;
        Sort sort = new Sort(Sort.Direction.DESC,"ddl");
        Pageable pageable = new PageRequest(page,size,sort);
        String school = getUserSession(request).getSchool();
        Page<Rtable> RTables = rtableRepository.findBySchool(school,pageable);
        return RTables;
    }

    //模糊查询圆桌
    @GetMapping(value = "/getRtable")
    public Page<Rtable> getRTable(HttpServletRequest request,String keyWord){
        int page = 0,size = 10;
        Sort sort = new Sort(Sort.Direction.DESC,"createtime");
        Pageable pageable = new PageRequest(page,size,sort);
        String school = getUserSession(request).getSchool();
        Page<Rtable> RTables = rtableRepository.search(keyWord,school,pageable);
        return RTables;
    }
}
