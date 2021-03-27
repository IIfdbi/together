package find_friend.po;

import java.io.Serializable;

/**
 * @author 
 */
public class NeedUser implements Serializable {
    private String needid;

    private Byte joined;

    private String userid;

    private static final long serialVersionUID = 1L;

    public String getNeedid() {
        return needid;
    }

    public void setNeedid(String needid) {
        this.needid = needid;
    }

    public Byte getJoined() {
        return joined;
    }

    public void setJoined(Byte joined) {
        this.joined = joined;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}