package find_friend.mapper;

import find_friend.po.TableUser;
import find_friend.po.TableUserExample;
import find_friend.po.TableUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TableUserMapper {
    long countByExample(TableUserExample example);

    int deleteByExample(TableUserExample example);

    int deleteByPrimaryKey(TableUserKey key);

    int insert(TableUser record);

    int insertSelective(TableUser record);

    List<TableUser> selectByExample(TableUserExample example);

    TableUser selectByPrimaryKey(TableUserKey key);

    int updateByExampleSelective(@Param("record") TableUser record, @Param("example") TableUserExample example);

    int updateByExample(@Param("record") TableUser record, @Param("example") TableUserExample example);

    int updateByPrimaryKeySelective(TableUser record);

    int updateByPrimaryKey(TableUser record);
}