package com.data2.project.system.role.entity;

import com.data2.framework.web.entity.BaseEntity;

import java.util.Arrays;

/**
 * 角色实体类 Role
 */
public class Role extends BaseEntity {
    private static final long serialVeersionUID =1L;

    /**角色ID*/
    private Long roleId;
    /**角色名*/
    private String roleName;
    /**角色权限*/
    private String roleKey;
    /**角色排序*/
    private String roleSort;
    /**角色状态：0正常，1禁用*/
    private int status;
    /**用户是否存在此角色标识，默认不存在*/
    private boolean flag = false;
    /**菜单组*/
    private Long[] menuIds;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey;
    }

    public String getRoleSort() {
        return roleSort;
    }

    public void setRoleSort(String roleSort) {
        this.roleSort = roleSort;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Long[] getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(Long[] menuIds) {
        this.menuIds = menuIds;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Role{");
        sb.append("roleId=").append(roleId);
        sb.append(", roleName='").append(roleName).append('\'');
        sb.append(", roleKey='").append(roleKey).append('\'');
        sb.append(", roleSort='").append(roleSort).append('\'');
        sb.append(", status=").append(status);
        sb.append(", flag=").append(flag);
        sb.append(", menuIds=").append(menuIds == null ? "null" : Arrays.asList(menuIds).toString());
        sb.append('}');
        return sb.toString();
    }
}
