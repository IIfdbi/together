package find_friend.mapper;

import find_friend.po.TalkExample;
import find_friend.po.TalkKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TalkMapper {
    long countByExample(TalkExample example);

    int deleteByExample(TalkExample example);

    int deleteByPrimaryKey(TalkKey key);

    int insert(TalkKey record);

    int insertSelective(TalkKey record);

    List<TalkKey> selectByExample(TalkExample example);

    int updateByExampleSelective(@Param("record") TalkKey record, @Param("example") TalkExample example);

    int updateByExample(@Param("record") TalkKey record, @Param("example") TalkExample example);
}