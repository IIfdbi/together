package find_friend.service;

import find_friend.po.Message;
import find_friend.utils.Response;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

public interface MessageService {
    Response<Boolean>saveMessage(Message message,String tableID);

    Response<String>getLatest(String userID,String tableID);

    Response<Boolean>clearUnread(String userID,String tableID);

    Response<ArrayList<Message>>getAllTableMessage(String tableID);
}
