package find_friend.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class NeedKey implements Serializable {
    private String needid;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    public String getNeedid() {
        return needid;
    }

    public void setNeedid(String needid) {
        this.needid = needid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}