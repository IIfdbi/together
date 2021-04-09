package find_friend.repository;

import find_friend.po.RtableUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by mengwei on 2018/4/22.
 */
public interface RtableUserRepository extends JpaRepository<RtableUser, String> {
    List<RtableUser> findByUserid(String userid);
    List<RtableUser> findByRtableid(String rtableid);
}
