package find_friend.mapper;

import find_friend.po.RtableUser;
import find_friend.po.RtableUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RtableUserMapper {
    long countByExample(RtableUserExample example);

    int deleteByExample(RtableUserExample example);

    int deleteByPrimaryKey(String rtablememberid);

    int insert(RtableUser record);

    int insertSelective(RtableUser record);

    List<RtableUser> selectByExample(RtableUserExample example);

    RtableUser selectByPrimaryKey(String rtablememberid);

    int updateByExampleSelective(@Param("record") RtableUser record, @Param("example") RtableUserExample example);

    int updateByExample(@Param("record") RtableUser record, @Param("example") RtableUserExample example);

    int updateByPrimaryKeySelective(RtableUser record);

    int updateByPrimaryKey(RtableUser record);
}