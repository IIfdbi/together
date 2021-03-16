package find_friend.mapper;

import find_friend.po.Message;
import find_friend.po.MessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageMapper {
    long countByExample(MessageExample example);

    int deleteByExample(MessageExample example);

    int deleteByPrimaryKey(String messageid);

    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExample(MessageExample example);

    Message selectByPrimaryKey(String messageid);

    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}