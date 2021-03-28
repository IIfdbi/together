package find_friend.po;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author 
 */
@Entity
@Table(name = ("RtableMessage"))
public class RtableMessage implements Serializable {
    @Id
    private String rtableid;

    private String messageid;

    private static final long serialVersionUID = 1L;

    public String getRtableid() {
        return rtableid;
    }

    public void setRtableid(String rtableid) {
        this.rtableid = rtableid;
    }

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid;
    }
}