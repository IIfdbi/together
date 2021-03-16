package find_friend.mapper;

import find_friend.po.TableMessageExample;
import find_friend.po.TableMessageKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableMessageMapper {
    long countByExample(TableMessageExample example);

    int deleteByExample(TableMessageExample example);

    int deleteByPrimaryKey(TableMessageKey key);

    int insert(TableMessageKey record);

    int insertSelective(TableMessageKey record);

    List<TableMessageKey> selectByExample(TableMessageExample example);

    int updateByExampleSelective(@Param("record") TableMessageKey record, @Param("example") TableMessageExample example);

    int updateByExample(@Param("record") TableMessageKey record, @Param("example") TableMessageExample example);
}