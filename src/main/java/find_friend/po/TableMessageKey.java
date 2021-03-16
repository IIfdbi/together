package find_friend.po;

import java.io.Serializable;

/**
 * @author 
 */
public class TableMessageKey implements Serializable {
    private String tableid;

    private String messageid;

    private static final long serialVersionUID = 1L;

    public String getTableid() {
        return tableid;
    }

    public void setTableid(String tableid) {
        this.tableid = tableid;
    }

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid;
    }
}