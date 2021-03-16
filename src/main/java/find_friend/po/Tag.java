package find_friend.po;

import java.io.Serializable;

/**
 * @author 
 */
public class Tag implements Serializable {
    private String tagid;

    private String tagname;

    private static final long serialVersionUID = 1L;

    public String getTagid() {
        return tagid;
    }

    public void setTagid(String tagid) {
        this.tagid = tagid;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }
}