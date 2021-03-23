package find_friend.service.imp;

import find_friend.mapper.UserMapper;
import find_friend.po.User;
import find_friend.po.UserExample;
import find_friend.service.UserService;
import find_friend.utils.MD5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import find_friend.utils.Response;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImp implements UserService{
    @Resource
    private UserMapper userMapper;


    public Response<User> register(User user) {
        Response<User> response = new Response<>();

        String name=user.getUsername();

        if(userNameExist(name)==true){
            return response.fail("用户名已存在");
        }
        user.setUserid(MD5Util.getMD5(new Date().toString()+user.getUsername()));
        user.setCreatetime(new Date());
        user.setPwd(MD5Util.getMD5(user.getPwd()));
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

        /** 验证用户是否激活邮箱 */
//        if (u.getEmailvalid() != true) {
//            return response.fail("邮件地址未验证");
//        }

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
}
