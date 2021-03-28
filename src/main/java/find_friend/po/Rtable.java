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
@Table(name = ("Rtable"))
public class Rtable implements Serializable {
    @Id
    private String rtableid;

    private Byte available;

    private Date createtime;

    private Date ddl;

    private String detail;

    private Byte done;

    private Short maxNumber;

    private String needid;

    private Short nowNumber;

    private String photo;

    private String rtablename;

    private String school;

    private static final long serialVersionUID = 1L;

    public String getRtableid() {
        return rtableid;
    }

    public void setRtableid(String rtableid) {
        this.rtableid = rtableid;
    }

    public Byte getAvailable() {
        return available;
    }

    public void setAvailable(Byte available) {
        this.available = available;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Byte getDone() {
        return done;
    }

    public void setDone(Byte done) {
        this.done = done;
    }

    public Short getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(Short maxNumber) {
        this.maxNumber = maxNumber;
    }

    public String getNeedid() {
        return needid;
    }

    public void setNeedid(String needid) {
        this.needid = needid;
    }

    public Short getNowNumber() {
        return nowNumber;
    }

    public void setNowNumber(Short nowNumber) {
        this.nowNumber = nowNumber;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getRtablename() {
        return rtablename;
    }

    public void setRtablename(String rtablename) {
        this.rtablename = rtablename;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}