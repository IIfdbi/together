package find_friend.service.imp;

import find_friend.mapper.KeyValueMapper;
import find_friend.mapper.UserMapper;
import find_friend.po.KeyValue;
import find_friend.po.KeyValueExample;
import find_friend.po.User;
import find_friend.po.UserExample;
import find_friend.service.UserService;
import find_friend.utils.MD5Util;
import find_friend.utils.RandomUtil;
import find_friend.utils.sendcloud.SendSMS;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import find_friend.utils.Response;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImp implements UserService{
    @Resource
    private UserMapper userMapper;

    @Resource
    private KeyValueMapper keyValueMapper;

    public Response<User> register(User user,String code) {
        Response<User> response = new Response<>();

        String name=user.getUsername();

        if(userNameExist(name)==true){
            return response.fail("用户名已存在");
        }

        //验证验证码
        KeyValueExample keyValueExample=new KeyValueExample();
        keyValueExample.or().andPhoneEqualTo(user.getPhone()).andCodeEqualTo(Integer.valueOf(code)).andStateEqualTo(new Byte("1"));
        List<KeyValue> list = keyValueMapper.selectByExample(keyValueExample);
        if (CollectionUtils.isEmpty(list)) {
            return response.fail("短信验证码不正确");
        }
        KeyValue keyValue=list.get(0);
        Date date=keyValue.getUpdateTime();
        Calendar gmtExpired = Calendar.getInstance();
        gmtExpired.setTime(date);
        Calendar now = Calendar.getInstance();
        if (now.after(gmtExpired)) {
            return response.fail("短信验证码已过期");
        }
        keyValue.setState(new Byte("2"));
        keyValueMapper.updateByExample(keyValue,keyValueExample);

        //创建用户
        user.setUserid(MD5Util.getMD5(new Date().toString()+user.getUsername()));
        user.setCreatetime(new Date());
        user.setPwd(MD5Util.getMD5(user.getPwd()));
        user.setSchool("武汉大学");
        int n = userMapper.insert(user);
        if (n <= 0) return response.fail("用户创建失败");

        return response.success("用户注册成功\n");
    }

    //用户登陆
    @Override
    public Response<User> signin(User user) {
        Response<User> response = new Response<>();

        String username = user.getUsername();
        String password = MD5Util.getMD5(user.getPwd());
        UserExample example = new UserExample();
        example.or().andUsernameEqualTo(username).andPwdEqualTo(password);

        /** 验证用户是否存在 */
        List<User> list = userMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(list)) {
            return response.fail("用户验证失败");
        }

        User u = list.get(0);


        u.setPwd("");
        response.setData(u);
        return response.success("用户登录成功");
    }

    public boolean userNameExist(String name) {
        UserExample example = new UserExample();
        example.or().andUsernameEqualTo(name);
        if (!CollectionUtils.isEmpty(userMapper.selectByExample(example))) {
            return true;
        }


        return false;
    }


    //用户信息修改
    @Override
    public Response<User> modify(User user) {
        Response<User> response = new Response<>();
        User oldUser=userMapper.selectByPrimaryKey(user.getUserid());
        if(user.getUsername()!=null&&!(user.getUsername().equals(oldUser.getUsername()))&&userNameExist(user.getUsername())==true){
            return response.fail("用户名已存在");
        }
        if(user.getPhoto()!=null){

        }
        if(user.getPwd()!=null){
            user.setPwd(MD5Util.getMD5(user.getPwd()));
        }
        UserExample userExample = new UserExample();
        userExample.or().andUseridEqualTo(user.getUserid());

        int n = userMapper.updateByExampleSelective(user, userExample);
        if (n > 0) {
            return response.success("修改成功");
        } else {
            return response.fail("修改失败");
        }
    }

    public Response<User> resetPwd(String phone,String code,String pwd){
        Response<User> response = new Response<>();

        //验证验证码
        KeyValueExample keyValueExample=new KeyValueExample();
        keyValueExample.or().andPhoneEqualTo(phone).andCodeEqualTo(Integer.valueOf(code)).andStateEqualTo(new Byte("1"));
        List<KeyValue> list = keyValueMapper.selectByExample(keyValueExample);
        if (CollectionUtils.isEmpty(list)) {
            return response.fail("短信验证码不正确");
        }
        KeyValue keyValue=list.get(0);
        Date date=keyValue.getUpdateTime();
        Calendar gmtExpired = Calendar.getInstance();
        gmtExpired.setTime(date);
        Calendar now = Calendar.getInstance();
        if (now.after(gmtExpired)) {
            return response.fail("短信验证码已过期");
        }
        keyValue.setState(new Byte("2"));
        keyValueMapper.updateByExample(keyValue,keyValueExample);

        //密码修改
        UserExample example=new UserExample();
        example.or().andPhoneEqualTo(phone);
        List<User>userList=userMapper.selectByExample(example);
        if(userList.size()<1)return response.fail("该手机号未注册");
        User user=userList.get(0);
        user.setPwd(MD5Util.getMD5(pwd));
        userMapper.updateByExample(user,example);
        return response.success("密码修改成功\n");
    }

    public Response<User> sendShortMessage(String phone){
        Response<User> response = new Response<>();
        String code = RandomUtil.getRandom(6);
        try {
            //String back=SendSMS.send(phone, code);
            String back="请求成功";
            if(!back.equals("请求成功")){
                return response.fail("短信验证码发送失败 "+back);
            }
        }catch (Exception e){
            return response.fail("短信验证码发送失败");
        }

        KeyValue kv = new KeyValue();
        kv.setCode(Integer.valueOf(code));
        kv.setPhone(phone);
        kv.setCreateTime(new Date());
        kv.setUpdateTime(new Date(System.currentTimeMillis()+30 * 60*1000));//30分钟后失效
        kv.setState(new Byte("1"));
        KeyValueExample example=new KeyValueExample();
        example.or().andPhoneEqualTo(phone).andStateEqualTo(new Byte("1"));
        List<KeyValue>list=keyValueMapper.selectByExample(example);
        if(list.size()>0) {
            for(int i=0;i<list.size();i++) {
                KeyValue kv2 = list.get(0);
                kv2.setState(new Byte("2"));
                keyValueMapper.updateByExample(kv2, example);
            }
        }
        int nn = keyValueMapper.insert(kv);
        if (nn <= 0) return response.fail("短信验证码发送失败");

        return response.success("短信验证码发送成功");
    }
}
