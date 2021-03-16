package find_friend.mapper;

import find_friend.po.Table;
import find_friend.po.TableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableMapper {
    long countByExample(TableExample example);

    int deleteByExample(TableExample example);

    int deleteByPrimaryKey(String tableid);

    int insert(Table record);

    int insertSelective(Table record);

    List<Table> selectByExample(TableExample example);

    Table selectByPrimaryKey(String tableid);

    int updateByExampleSelective(@Param("record") Table record, @Param("example") TableExample example);

    int updateByExample(@Param("record") Table record, @Param("example") TableExample example);

    int updateByPrimaryKeySelective(Table record);

    int updateByPrimaryKey(Table record);
}