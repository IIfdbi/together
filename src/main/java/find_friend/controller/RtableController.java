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
    public ResponseEntity<ResultModel> createRTable(String needid,String RTablename,String max,String ddl,HttpServletRequest request){
        Need need = needRepository.findByNeedid(needid);
        if(need == null){
            return new ResponseEntity<>(ResultModel.error(HttpStatus.BAD_REQUEST,"非法的需求"), HttpStatus.BAD_REQUEST);
        }
        Rtable RTable = new Rtable();
        RTable.setRtableid(UUID.randomUUID().toString().replaceAll("-", ""));
        RTable.setMaxNumber(Short.parseShort(max));
        RTable.setAvailable(Byte.parseByte("0"));
        RTable.setCreatetime(need.getCreatetime());
        RTable.setDdl(new Date(ddl));
        RTable.setNowNumber(Short.parseShort("1"));
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

    //获取单个圆桌
    @GetMapping(value = "/getOne")
    public Rtable getOne(String rtableid){
        return rtableRepository.findByRtableid(rtableid);
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
        ru.setUnreadmessage(0);
        rtableUserRepository.save(ru);
        return new ResponseEntity<>(ResultModel.ok("加入圆桌成功"), HttpStatus.OK);
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
        Page<Rtable> RTables = null;
        if(school.equals("")){
            RTables = rtableRepository.findAll(pageable);
        }
        else {
            RTables = rtableRepository.findBySchool(school, pageable);
        }
        return RTables;
    }

    //获取用户当前学校所有圆桌-截止时间排序
    @GetMapping(value = "/getSchoolRtablesByDDL")
    public Page<Rtable> getSchoolRTableByDDL(HttpServletRequest request){
        int page = 0,size = 10;
        Sort sort = new Sort(Sort.Direction.DESC,"ddl");
        Pageable pageable = new PageRequest(page,size,sort);
        String school = getUserSession(request).getSchool();
        Page<Rtable> RTables = null;
        if(school.equals("")){
            RTables = rtableRepository.findAll(pageable);
        }
        else {
            RTables = rtableRepository.findBySchool(school, pageable);
        }
        return RTables;
    }

    //模糊查询圆桌
    @GetMapping(value = "/getRtable")
    public Page<Rtable> getRTable(HttpServletRequest request,String keyWord){
        int page = 0,size = 10;
        Sort sort = new Sort(Sort.Direction.DESC,"createtime");
        Pageable pageable = new PageRequest(page,size,sort);
        String school = getUserSession(request).getSchool();
        Page<Rtable> RTables = null;
        if(school.equals("")){
            RTables = rtableRepository.searchWithoutSchool(keyWord,pageable);
        }
        else {
            RTables = rtableRepository.search(keyWord,school,pageable);
        }
        return RTables;
    }

    //查询是否准备
    @GetMapping(value = "/isReady")
    public boolean isReady(HttpServletRequest request,String rtableid){
        List<RtableUser> RTables = rtableUserRepository.findByUserid(getUserSession(request).getUserid());
        for(int i=0;i<RTables.size();i++){
            if(RTables.get(i).getRtableid().equals(rtableid)){
                if(RTables.get(i).getReady().intValue() == 0){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }

    //用户在圆桌准备
    @PostMapping(value = "/beReady")
    public ResponseEntity<ResultModel> beReady(HttpServletRequest request,String rtableid){
        List<RtableUser> RTables = rtableUserRepository.findByUserid(getUserSession(request).getUserid());
        for(int i=0;i<RTables.size();i++){
            if(RTables.get(i).getRtableid().equals(rtableid)){
                RTables.get(i).setReady(Byte.parseByte("1"));
                rtableUserRepository.save(RTables.get(i));
                return new ResponseEntity<>(ResultModel.ok("用户已准备"), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(ResultModel.error(HttpStatus.BAD_REQUEST,"用户准备失败"), HttpStatus.BAD_REQUEST);
    }

    //用户在圆桌取消准备
    @PostMapping(value = "/beUnready")
    public ResponseEntity<ResultModel> beUnready(HttpServletRequest request,String rtableid){
        List<RtableUser> RTables = rtableUserRepository.findByUserid(getUserSession(request).getUserid());
        for(int i=0;i<RTables.size();i++){
            if(RTables.get(i).getRtableid().equals(rtableid)){
                RTables.get(i).setReady(Byte.parseByte("0"));
                rtableUserRepository.save(RTables.get(i));
                return new ResponseEntity<>(ResultModel.ok("用户已取消准备"), HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(ResultModel.error(HttpStatus.BAD_REQUEST,"用户取消准备失败"), HttpStatus.BAD_REQUEST);
    }

    //获取当前圆桌除队长是否全部准备
    @GetMapping(value = "isAllReady")
    public boolean isAllReady(HttpServletRequest request,String rtableid){
        List<RtableUser> RTables = rtableUserRepository.findByRtableid(rtableid);
        for(int i=0;i<RTables.size();i++){
            if(RTables.get(i).getIdentity().equals("1")){
                if(RTables.get(i).getReady().intValue()==0){
                    return false;
                }
            }
        }
        return true;
    }

    //根据需求匹配圆桌
    @GetMapping(value = "findRtableByNeed")
    public List<Rtable> findRtableByNeed(HttpServletRequest request, String needid){
        String school = getUserSession(request).getSchool();
        Need need = needRepository.findByNeedid(needid);
        String first_tag = need.getFirstTag();
        String second_tag = need.getSecondTag();
        List<Rtable> l1 = rtableRepository.searchByFirsttag(first_tag,school);
        List<Rtable> l2 = rtableRepository.searchBySecondtag(second_tag, school);
        l1.addAll(l2);
        for  ( int  i  =   0 ; i  <  l1.size()  -   1 ; i ++ )  {
            for  ( int  j  =  l1.size()  -   1 ; j  >  i; j -- )  {
                if  (l1.get(j).equals(l1.get(i)))  {
                    l1.remove(j);
                }
            }
        }
        //去掉超过ddl的
        for(Rtable t : l1){
            if(t.getDdl().compareTo(new Date())<0){
                l1.remove(t);
            }
        }
        //去掉剩余人数不足的
        for(Rtable t : l1){
            if((t.getMaxNumber()-t.getNowNumber())<need.getMaxcount()){
                l1.remove(t);
            }
        }
        return l1;
    }
}
