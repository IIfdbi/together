package find_friend.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Message implements Serializable {
    private String messageid;

    private String content;

    private Date createtime;

    private String userid;

    private static final long serialVersionUID = 1L;

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}