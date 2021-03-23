package find_friend.controller;

import find_friend.po.User;
import find_friend.service.UserService;
import find_friend.utils.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/user")
public class UserController extends BaseController{

    @Resource
    UserService userService;

    //注册
    @PostMapping(value="/register")
    public ResponseEntity<Response<User>> userAdd(@Validated({User.CREATE.class}) User user,
                BindingResult bindingResult){
            Response<User> response = new Response<>();
            if (bindingResult.hasErrors()) {
                response.fail(bindingResult.getFieldErrors().get(0).getDefaultMessage());
                return new ResponseEntity<Response<User>>(response, HttpStatus.OK);
            }
            response = userService.register(user);
            //recordOperation()
            return new ResponseEntity<Response<User>>(response, HttpStatus.OK);
    }

    //用户登陆
    @RequestMapping(value = "/signin")
    public ResponseEntity<Response<User>> signin(
            HttpServletRequest request,
            @Validated({User.LOGIN.class}) User user,
            BindingResult bindingResult) {
        Response<User> response = new Response<>();

        if (getUserSession(request)!=null){
            setUserSession(request, null);
            response.setData(null);
        }

        if (bindingResult.hasErrors()) {
            response.fail(bindingResult.getFieldErrors().get(0).getDefaultMessage());
            return new ResponseEntity<Response<User>>(response, HttpStatus.OK);
        }
        response = userService.signin(user);
        if (response.getResult()) {
            setUserSession(request, response.getData());
        }
        return new ResponseEntity<Response<User>>(response, HttpStatus.OK);
    }

    //用户登出
    @RequestMapping(value = "/signout")
    public ResponseEntity<Response<Boolean>> signout(HttpServletRequest request) {
        Response<Boolean> response = new Response<>();
        if (getUserSession(request)==null){
            response.fail("请先登录");
            return new ResponseEntity<Response<Boolean>>(response, HttpStatus.OK);
        }
        setUserSession(request, null);
        response.setData(true);
        response.success("登出成功");
        return new ResponseEntity<Response<Boolean>>(response, HttpStatus.OK);
    }
}
