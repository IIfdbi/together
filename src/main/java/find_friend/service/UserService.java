package find_friend.service;

import find_friend.po.User;
import find_friend.utils.Response;


public interface UserService {
    //注册一个用户
    Response<User> register(User user);

    //用户登陆
    Response<User> signin(User user);

    //用户信息修改
    Response<User> modify(User user);
}
