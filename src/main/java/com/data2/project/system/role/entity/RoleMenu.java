package com.data2.project.system.role.entity;

/**
 * 角色与菜单关联
 */
public class RoleMenu {
    private Long roleId;
    private Long menuId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RoleMenu{");
        sb.append("roleId=").append(roleId);
        sb.append(", menuId=").append(menuId);
        sb.append('}');
        return sb.toString();
    }
}
