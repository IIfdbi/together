package find_friend.po;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author 
 */
@Entity
@Table(name = "NeedUser")
public class NeedUser extends NeedUserKey implements Serializable {
    @Id
    private String needid;

    private String userid;

    private Byte joined;

    private static final long serialVersionUID = 1L;

    public Byte getJoined() {
        return joined;
    }

    public void setJoined(Byte joined) {
        this.joined = joined;
    }
}