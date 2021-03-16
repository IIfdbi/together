package find_friend.mapper;

import find_friend.po.Relation;
import find_friend.po.RelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationMapper {
    long countByExample(RelationExample example);

    int deleteByExample(RelationExample example);

    int deleteByPrimaryKey(String relationid);

    int insert(Relation record);

    int insertSelective(Relation record);

    List<Relation> selectByExample(RelationExample example);

    Relation selectByPrimaryKey(String relationid);

    int updateByExampleSelective(@Param("record") Relation record, @Param("example") RelationExample example);

    int updateByExample(@Param("record") Relation record, @Param("example") RelationExample example);

    int updateByPrimaryKeySelective(Relation record);

    int updateByPrimaryKey(Relation record);
}