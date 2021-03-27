package find_friend.mapper;

import find_friend.po.NeedUser;
import find_friend.po.NeedUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface NeedUserMapper {
    long countByExample(NeedUserExample example);

    int deleteByExample(NeedUserExample example);

    int deleteByPrimaryKey(String needid);

    int insert(NeedUser record);

    int insertSelective(NeedUser record);

    List<NeedUser> selectByExample(NeedUserExample example);

    NeedUser selectByPrimaryKey(String needid);

    int updateByExampleSelective(@Param("record") NeedUser record, @Param("example") NeedUserExample example);

    int updateByExample(@Param("record") NeedUser record, @Param("example") NeedUserExample example);

    int updateByPrimaryKeySelective(NeedUser record);

    int updateByPrimaryKey(NeedUser record);
}