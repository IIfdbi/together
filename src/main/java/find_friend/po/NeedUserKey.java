package find_friend.po;

import java.io.Serializable;

/**
 * @author 
 */
public class NeedUserKey implements Serializable {
    private String needid;

    private String userid;

    private static final long serialVersionUID = 1L;

    public String getNeedid() {
        return needid;
    }

    public void setNeedid(String needid) {
        this.needid = needid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}