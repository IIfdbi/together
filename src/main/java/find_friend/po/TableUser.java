package find_friend.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TableUser extends TableUserKey implements Serializable {
    private String identity;

    private Byte ready;

    private Date jointime;

    private Byte joined;

    private static final long serialVersionUID = 1L;

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Byte getReady() {
        return ready;
    }

    public void setReady(Byte ready) {
        this.ready = ready;
    }

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    public Byte getJoined() {
        return joined;
    }

    public void setJoined(Byte joined) {
        this.joined = joined;
    }
}