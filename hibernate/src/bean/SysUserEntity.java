package bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 用户的实体类
 * @author Lstar
 * @version 1.0
 * @date 2020/4/22 15:39
 */
public class SysUserEntity implements Serializable {
    private Long userID;
    private String userName;
    private String userPassword;
    private String userState;

    //多对多关系映射:一个用户可以具备多个角色
    private Set<SysRoleEntity> roles = new HashSet<SysRoleEntity>(0);

    public Set<SysRoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(Set<SysRoleEntity> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "SysUserEntity{" +
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userState='" + userState + '\'' +
                '}';
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }
}
