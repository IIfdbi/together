package find_friend.po;

import java.io.Serializable;

/**
 * @author 
 */
public class RtableMessage implements Serializable {
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