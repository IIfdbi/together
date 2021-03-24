package find_friend.po;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
@Entity
@Table(name = "Need")
public class Need implements Serializable {
    @Id
    private String needid;

    private String createuserid;

    private Short maxcount;

    private Date createtime;

    private Date ddl;

    private String detail;

    private String firstTag;

    private String secondTag;

    private Byte submitted;

    private static final long serialVersionUID = 1L;

    public String getNeedid() {
        return needid;
    }

    public void setNeedid(String needid) {
        this.needid = needid;
    }

    public String getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid;
    }

    public Short getMaxcount() {
        return maxcount;
    }

    public void setMaxcount(Short maxcount) {
        this.maxcount = maxcount;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getDdl() {
        return ddl;
    }

    public void setDdl(Date ddl) {
        this.ddl = ddl;
    }

    public String getdetail() {
        return detail;
    }

    public void setdetail(String detail) {
        this.detail = detail;
    }

    public String getFirstTag() {
        return firstTag;
    }

    public void setFirstTag(String firstTag) {
        this.firstTag = firstTag;
    }

    public String getSecondTag() {
        return secondTag;
    }

    public void setSecondTag(String secondTag) {
        this.secondTag = secondTag;
    }

    public Byte getSubmitted() {
        return submitted;
    }

    public void setSubmitted(Byte submitted) {
        this.submitted = submitted;
    }
}