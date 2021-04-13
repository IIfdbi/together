package find_friend.service.imp;

import find_friend.mapper.MessageMapper;
import find_friend.mapper.RtableMessageMapper;
import find_friend.mapper.RtableUserMapper;
import find_friend.po.*;
import find_friend.service.MessageService;
import find_friend.utils.MD5Util;
import find_friend.utils.Response;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class MessageServiceImp implements MessageService {
    @Resource
    MessageMapper messageMapper;

    @Resource
    RtableMessageMapper rtableMessageMapper;

    @Resource
    RtableUserMapper rtableUserMapper;

    public Response<Boolean> saveMessage(Message message,String tableID){
        Response<Boolean> response = new Response<Boolean>();

        if(message.getContent()==null||message.getUserid()==null){
            response.setData(false);
            return response.fail("message缺少字段");
        }


        RtableUserExample example=new RtableUserExample();
        example.or().andRtableidEqualTo(tableID);
        List<RtableUser> list=rtableUserMapper.selectByExample(example);
        Boolean flag=false;
        for(RtableUser rtableUser:list) {
            if(rtableUser.getUserid().equals(message.getUserid()))flag=true;
        }
        if(flag==false){
            response.setData(false);
            return response.fail("此用户不是此圆桌的人");
        }
        for(RtableUser rtableUser:list){
            rtableUser.setUnreadmessage(rtableUser.getUnreadmessage()+1);
            rtableUser.setLatestmessageid(message.getMessageid());
            rtableUserMapper.updateByPrimaryKey(rtableUser);
        }

        message.setCreatetime(new Date());
        int ram= new Random().nextInt();
        message.setMessageid(MD5Util.getMD5(ram+message.getUserid()+message.getContent()));
        messageMapper.insert(message);

        RtableMessage rtableMessage=new RtableMessage();
        rtableMessage.setMessageid(message.getMessageid());
        rtableMessage.setRtableid(tableID);
        rtableMessageMapper.insert(rtableMessage);

        response.setData(true);
        return response;
    }

    public Response<String>getLatest(String userID,String tableID){
        Response<String> response=new Response<String>();

        RtableUserExample example=new RtableUserExample();
        example.or().andUseridEqualTo(userID).andRtableidEqualTo(tableID);
        List<RtableUser>list=rtableUserMapper.selectByExample(example);
        if(list.size()<1){
            response.setData("");
            return response.fail("未找到匹配的圆桌用户");
        }
        RtableUser user=list.get(0);
        String result=user.getUnreadmessage().toString()+"-";
        MessageExample messageExample=new MessageExample();
        messageExample.or().andMessageidEqualTo(user.getLatestmessageid());
        List<Message>messageList=messageMapper.selectByExample(messageExample);
        if(messageList.size()<1){
            response.setData("");
            response.fail("未找到最新一条消息");
        }
        Message message=messageList.get(0);
        result+=message.getContent();

        response.setData(result);
        return response;
    }

    public Response<Boolean>clearUnread(String userID,String tableID){
        Response<Boolean> response = new Response<Boolean>();

        RtableUserExample example=new RtableUserExample();
        example.or().andUseridEqualTo(userID).andRtableidEqualTo(tableID);
        List<RtableUser>list=rtableUserMapper.selectByExample(example);
        if(list.size()<1){
            response.setData(false);
            return response.fail("未找到匹配的圆桌用户");
        }
        RtableUser user=list.get(0);
        user.setUnreadmessage(0);
        rtableUserMapper.updateByPrimaryKey(user);

        response.setData(true);
        return response;
    }


    public Response<ArrayList<Message>>getAllTableMessage(String tableID){
        Response<ArrayList<Message>> response=new Response<ArrayList<Message>>();
        ArrayList<Message> list=new ArrayList<Message>();

        RtableMessageExample example=new RtableMessageExample();
        example.or().andRtableidEqualTo(tableID);
        List<RtableMessage>rtableMessageList=rtableMessageMapper.selectByExample(example);
        if(rtableMessageList.size()<1){
            return response.fail("未找此圆桌的消息");
        }
        for(RtableMessage rtableMessage:rtableMessageList){
            String messageId=rtableMessage.getMessageid();
            MessageExample messageExample=new MessageExample();
            messageExample.or().andMessageidEqualTo(messageId);
            List<Message>messageList=messageMapper.selectByExample(messageExample);
            if(messageList.size()>0){
                list.add(messageList.get(0));
            }
        }

        response.setData(list);
        return response;
    }



}
