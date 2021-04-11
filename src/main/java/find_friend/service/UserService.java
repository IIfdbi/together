package find_friend.service;

import find_friend.po.User;
import find_friend.utils.Response;


public interface UserService {
    //注册一个用户
    Response<User> register(User user,String code);

    //用户登陆
    Response<User> signin(User user);

    //用户信息修改
    Response<User> modify(User user);

    //发送验证码短信
    Response<User> sendShortMessage(String phone);

    //短信重设密码
    Response<User> resetPwd(String phone,String code,String pwd);
}
