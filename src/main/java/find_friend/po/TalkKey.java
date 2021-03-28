package find_friend.po;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author 
 */
@Entity
@Table(name = "Talk")
public class TalkKey implements Serializable {
    @Id
    private String relationid;

    private String messageid;

    private static final long serialVersionUID = 1L;

    public String getRelationid() {
        return relationid;
    }

    public void setRelationid(String relationid) {
        this.relationid = relationid;
    }

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid;
    }
}