package com.data2.project.system.menu.entity;

import com.data2.framework.web.entity.BaseEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单
 */
public class Menu extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**菜单ID*/
    private Long menuId;
    /**菜单名称*/
    private String menuName;
    /**父菜单名称*/
    private String parentName;
    /**父菜单ID*/
    private Long parentId;
    /**显示顺序*/
    private String orderNum;
    /**菜单url*/
    private String url;
    /**类型：0目录，1菜单，2按钮*/
    private String menuType;
    /**菜单状态：0显示，1隐藏*/
    private String visible;
    /**权限字符串*/
    private String perms;
    /**菜单图标*/
    private String icon;
    /**子菜单*/
    private List<Menu> children = new ArrayList<Menu>();

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Menu{");
        sb.append("menuId=").append(menuId);
        sb.append(", menuName='").append(menuName).append('\'');
        sb.append(", parentName='").append(parentName).append('\'');
        sb.append(", parentId=").append(parentId);
        sb.append(", orderNum='").append(orderNum).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", menuType='").append(menuType).append('\'');
        sb.append(", visible='").append(visible).append('\'');
        sb.append(", perms='").append(perms).append('\'');
        sb.append(", icon='").append(icon).append('\'');
        sb.append(", children=").append(children);
        sb.append('}');
        return sb.toString();
    }
}
