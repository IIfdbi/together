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
@Table(name = "Need")
public class Need implements Serializable {
    @Id
    String needid;

    private String createuserid;

    private Date ddl;

    private String detail;

    private String firstTag;

    private Short maxcount;

    private String school;

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

    public Date getDdl() {
        return ddl;
    }

    public void setDdl(Date ddl) {
        this.ddl = ddl;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getFirstTag() {
        return firstTag;
    }

    public void setFirstTag(String firstTag) {
        this.firstTag = firstTag;
    }

    public Short getMaxcount() {
        return maxcount;
    }

    public void setMaxcount(Short maxcount) {
        this.maxcount = maxcount;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
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