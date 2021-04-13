package find_friend.controller;

import find_friend.po.Message;
import find_friend.po.User;
import find_friend.service.MessageService;
import find_friend.utils.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/message")
public class MessageController extends BaseController{

    @Resource
    MessageService messageService;

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

//    保存消息
        @RequestMapping(value="/saveMessage")
    public ResponseEntity<Response<Boolean>> sendShortMessage(HttpServletRequest request,Message message,String tableid){
        logger.info("saveMessage");
        Response<Boolean> response = new Response<Boolean>();
            if (getUserSession(request)==null){
                response.fail("请先登录");
                return new ResponseEntity<Response<Boolean>>(response, HttpStatus.OK);
            }
            message.setUserid(getUserSession(request).getUserid());

        response = messageService.saveMessage(message,tableid);

        return new ResponseEntity<Response<Boolean>>(response, HttpStatus.OK);
    }

//    获取当前圆桌最后一条消息及当前未读消息个数接口
    @RequestMapping(value="/getLatest")
    public ResponseEntity<Response<String>> getLatest(HttpServletRequest request,String tableid){
        logger.info("getLatest");
        Response<String> response = new Response<String>();

        if (getUserSession(request)==null){
            response.fail("请先登录");
            return new ResponseEntity<Response<String>>(response, HttpStatus.OK);
        }
        String userid=getUserSession(request).getUserid();

        response = messageService.getLatest(userid,tableid);

        return new ResponseEntity<Response<String>>(response, HttpStatus.OK);
    }

//    清除未读
    @RequestMapping(value="/clearUnread")
    public ResponseEntity<Response<Boolean>> clearUnread(HttpServletRequest request,String tableid){
        logger.info("getLatest");
        Response<Boolean> response = new Response<Boolean>();
        if (getUserSession(request)==null){
            response.fail("请先登录");
            return new ResponseEntity<Response<Boolean>>(response, HttpStatus.OK);
        }
        String userid=getUserSession(request).getUserid();
        response = messageService.clearUnread(userid,tableid);

        return new ResponseEntity<Response<Boolean>>(response, HttpStatus.OK);
    }

//    获取圆桌所有消息
    @RequestMapping(value="/getAllTableMessage")
    public ResponseEntity<Response<ArrayList<Message>>> getAllTableMessage(HttpServletRequest request,String tableid){
        logger.info("getAllTableMessage");
        Response<ArrayList<Message>> response = new Response<ArrayList<Message>>();
        if (getUserSession(request)==null){
            response.fail("请先登录");
            return new ResponseEntity<Response<ArrayList<Message>>>(response, HttpStatus.OK);
        }
        response = messageService.getAllTableMessage(tableid);

        return new ResponseEntity<Response<ArrayList<Message>>>(response, HttpStatus.OK);
    }

}
