package find_friend.mapper;

import find_friend.po.KeyValue;
import find_friend.po.KeyValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface KeyValueMapper {
    long countByExample(KeyValueExample example);

    int deleteByExample(KeyValueExample example);

    int deleteByPrimaryKey(Integer messageId);

    int insert(KeyValue record);

    int insertSelective(KeyValue record);

    List<KeyValue> selectByExample(KeyValueExample example);

    KeyValue selectByPrimaryKey(Integer messageId);

    int updateByExampleSelective(@Param("record") KeyValue record, @Param("example") KeyValueExample example);

    int updateByExample(@Param("record") KeyValue record, @Param("example") KeyValueExample example);

    int updateByPrimaryKeySelective(KeyValue record);

    int updateByPrimaryKey(KeyValue record);
}