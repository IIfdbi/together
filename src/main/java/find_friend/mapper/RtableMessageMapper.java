package find_friend.mapper;

import find_friend.po.RtableMessage;
import find_friend.po.RtableMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RtableMessageMapper {
    long countByExample(RtableMessageExample example);

    int deleteByExample(RtableMessageExample example);

    int deleteByPrimaryKey(String rtableid);

    int insert(RtableMessage record);

    int insertSelective(RtableMessage record);

    List<RtableMessage> selectByExample(RtableMessageExample example);

    RtableMessage selectByPrimaryKey(String rtableid);

    int updateByExampleSelective(@Param("record") RtableMessage record, @Param("example") RtableMessageExample example);

    int updateByExample(@Param("record") RtableMessage record, @Param("example") RtableMessageExample example);

    int updateByPrimaryKeySelective(RtableMessage record);

    int updateByPrimaryKey(RtableMessage record);
}