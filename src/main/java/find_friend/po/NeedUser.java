package find_friend.po;

import java.io.Serializable;

/**
 * @author 
 */
public class NeedUser extends NeedUserKey implements Serializable {
    private Byte joined;

    private static final long serialVersionUID = 1L;

    public Byte getJoined() {
        return joined;
    }

    public void setJoined(Byte joined) {
        this.joined = joined;
    }
}