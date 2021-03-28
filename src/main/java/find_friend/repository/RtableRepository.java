package find_friend.repository;

import find_friend.po.Rtable;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by mengwei on 2018/4/22.
 */
public interface RtableRepository extends JpaRepository<Rtable, String> {
    Rtable findByRtableid(String Rtableid);

    Page<Rtable> findBySchool(String school, Pageable pageable);

    @Query("select u from Rtable u where u.school = ?2 and u.rtablename like ?1")
    Page<Rtable> search(@Param("searchText") String searchText,@Param("school")String school,Pageable pageable);
}
