package find_friend.po;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Table implements Serializable {
    private String tableid;

    private String photo;

    private Short maxNumber;

    private Short nowNumber;

    private Byte available;

    private Date createtime;

    private Date ddl;

    private String describe;

    private Byte done;

    private String needid;

    private String tablename;

    private static final long serialVersionUID = 1L;

    public String getTableid() {
        return tableid;
    }

    public void setTableid(String tableid) {
        this.tableid = tableid;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Short getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(Short maxNumber) {
        this.maxNumber = maxNumber;
    }

    public Short getNowNumber() {
        return nowNumber;
    }

    public void setNowNumber(Short nowNumber) {
        this.nowNumber = nowNumber;
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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Byte getDone() {
        return done;
    }

    public void setDone(Byte done) {
        this.done = done;
    }

    public String getNeedid() {
        return needid;
    }

    public void setNeedid(String needid) {
        this.needid = needid;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }
}