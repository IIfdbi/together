package find_friend.po;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author 
 */
@Entity
@Table(name = "Tag")
public class Tag implements Serializable {
    @Id
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