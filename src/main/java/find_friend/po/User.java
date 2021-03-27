package find_friend.po;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class User implements Serializable {
    //用于表明验证类型的一组空接口
    public interface CREATE {
    }
    public interface UPDATE {
    }
    public interface LOGIN {
    }
    public interface RESET_PASSWORD {
    }

    @NotBlank(message = "用户名称不能为空", groups = {CREATE.class, LOGIN.class,RESET_PASSWORD.class})
    @Size(min = 3, max = 32, message = "名字长度必须在3和32之间", groups = {CREATE.class, LOGIN.class,RESET_PASSWORD.class})
    private String username;

    @NotBlank(message = "密码不能为空", groups = {CREATE.class, LOGIN.class, RESET_PASSWORD.class})
    @Size(min = 6, max = 16, message = "密码长度必须在6和16之间", groups = {CREATE.class, LOGIN.class, RESET_PASSWORD.class})
    private String pwd;

    private String userid;

    private Date createtime;

    private String department;

    private String hobby;

    private String nickname;

    private String photo;

    private String school;

    private static final long serialVersionUID = 1L;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}