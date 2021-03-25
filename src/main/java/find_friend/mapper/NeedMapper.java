package find_friend.mapper;

import find_friend.po.Need;
import find_friend.po.NeedExample;
import find_friend.po.NeedKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeedMapper {
    long countByExample(NeedExample example);

    int deleteByExample(NeedExample example);

    int deleteByPrimaryKey(NeedKey key);

    int insert(Need record);

    int insertSelective(Need record);

    List<Need> selectByExample(NeedExample example);

    Need selectByPrimaryKey(NeedKey key);

    int updateByExampleSelective(@Param("record") Need record, @Param("example") NeedExample example);

    int updateByExample(@Param("record") Need record, @Param("example") NeedExample example);

    int updateByPrimaryKeySelective(Need record);

    int updateByPrimaryKey(Need record);
}