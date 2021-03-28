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
public class Need extends NeedKey implements Serializable {
    @Id
    private String needid;

    private String createuserid;

    private Date createtime;

    @Override
    public Date getCreatetime() {
        return createtime;
    }

    @Override
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    private Short maxcount;

    @Override
    public String getNeedid() {
        return needid;
    }

    @Override
    public void setNeedid(String needid) {
        this.needid = needid;
    }

    private Date ddl;

    private String detail;

    private String firstTag;

    private String secondTag;

    private Byte submitted;

    private String school;

    private static final long serialVersionUID = 1L;

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

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}