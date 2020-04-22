package bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 角色的实体类
 * @author Lstar
 * @version 1.0
 * @date 2020/4/22 15:41
 */
public class SysRoleEntity implements Serializable {
    private Long roleID;
    private String roleName;
    private String roleMemo;

    //多对多关系映射：一个角色可以包含多个用户
    private Set<SysUserEntity> users = new HashSet<SysUserEntity>(0);

    public Set<SysUserEntity> getUsers() {
        return  users;
    }

    public void setUsers(Set<SysUserEntity> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "SysRoleEntity{" +
                "roleID=" + roleID +
                ", roleName='" + roleName + '\'' +
                ", roleMemo='" + roleMemo + '\'' +
                '}';
    }

    public Long getRoleID() {
        return roleID;
    }

    public void setRoleID(Long roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleMemo() {
        return roleMemo;
    }

    public void setRoleMemo(String roleMemo) {
        this.roleMemo = roleMemo;
    }
}
