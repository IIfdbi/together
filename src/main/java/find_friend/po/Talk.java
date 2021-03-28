package find_friend.po;

import java.io.Serializable;

/**
 * @author 
 */

public class Talk implements Serializable {
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