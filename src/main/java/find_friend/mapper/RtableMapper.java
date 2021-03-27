package find_friend.mapper;

import find_friend.po.Rtable;
import find_friend.po.RtableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RtableMapper {
    long countByExample(RtableExample example);

    int deleteByExample(RtableExample example);

    int deleteByPrimaryKey(String rtableid);

    int insert(Rtable record);

    int insertSelective(Rtable record);

    List<Rtable> selectByExample(RtableExample example);

    Rtable selectByPrimaryKey(String rtableid);

    int updateByExampleSelective(@Param("record") Rtable record, @Param("example") RtableExample example);

    int updateByExample(@Param("record") Rtable record, @Param("example") RtableExample example);

    int updateByPrimaryKeySelective(Rtable record);

    int updateByPrimaryKey(Rtable record);
}