package find_friend.po;

import java.io.Serializable;

/**
 * @author 
 */
public class TableUserKey implements Serializable {
    private String userid;

    private String tableid;

    private String tablememberid;

    private static final long serialVersionUID = 1L;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getTableid() {
        return tableid;
    }

    public void setTableid(String tableid) {
        this.tableid = tableid;
    }

    public String getTablememberid() {
        return tablememberid;
    }

    public void setTablememberid(String tablememberid) {
        this.tablememberid = tablememberid;
    }
}