package find_friend.repository;

import find_friend.po.Need;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by mengwei on 2018/4/12.
 */
public interface NeedRepository extends JpaRepository<Need, String>{
    Need findByNeedid(String needid);

    List<Need> findByCreateuserid(String userid);
}
