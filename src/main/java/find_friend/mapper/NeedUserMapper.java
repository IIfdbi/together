package find_friend.mapper;

import find_friend.po.NeedUser;
import find_friend.po.NeedUserExample;
import find_friend.po.NeedUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NeedUserMapper {
    long countByExample(NeedUserExample example);

    int deleteByExample(NeedUserExample example);

    int deleteByPrimaryKey(NeedUserKey key);

    int insert(NeedUser record);

    int insertSelective(NeedUser record);

    List<NeedUser> selectByExample(NeedUserExample example);

    NeedUser selectByPrimaryKey(NeedUserKey key);

    int updateByExampleSelective(@Param("record") NeedUser record, @Param("example") NeedUserExample example);

    int updateByExample(@Param("record") NeedUser record, @Param("example") NeedUserExample example);

    int updateByPrimaryKeySelective(NeedUser record);

    int updateByPrimaryKey(NeedUser record);
}