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

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    UserService userService;


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
}
