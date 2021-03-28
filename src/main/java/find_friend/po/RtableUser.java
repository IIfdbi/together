package find_friend.po;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
@Entity
@Table(name = ("RtableUser"))
public class RtableUser implements Serializable {
    @Id
    private String rtablememberid;

    private String identity;

    private Byte joined;

    private Date jointime;

    private Byte ready;

    private String rtableid;

    private String userid;

    private static final long serialVersionUID = 1L;

    public String getRtablememberid() {
        return rtablememberid;
    }

    public void setRtablememberid(String rtablememberid) {
        this.rtablememberid = rtablememberid;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Byte getJoined() {
        return joined;
    }

    public void setJoined(Byte joined) {
        this.joined = joined;
    }

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    public Byte getReady() {
        return ready;
    }

    public void setReady(Byte ready) {
        this.ready = ready;
    }

    public String getRtableid() {
        return rtableid;
    }

    public void setRtableid(String rtableid) {
        this.rtableid = rtableid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}