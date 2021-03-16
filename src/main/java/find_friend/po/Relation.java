package find_friend.po;

import java.io.Serializable;

/**
 * @author 
 */
public class Relation implements Serializable {
    private String relationid;

    private String userid;

    private String parternerid;

    private static final long serialVersionUID = 1L;

    public String getRelationid() {
        return relationid;
    }

    public void setRelationid(String relationid) {
        this.relationid = relationid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getParternerid() {
        return parternerid;
    }

    public void setParternerid(String parternerid) {
        this.parternerid = parternerid;
    }
}