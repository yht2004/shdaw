package com.data2.project.system.role.mapper;

import com.data2.project.system.menu.entity.Menu;
import com.data2.project.system.role.entity.RoleMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 角色菜单关联表 数据层
 */
@Mapper
public interface RoleMenuMapper {

    /**
     * 根据觉得ID删除角色菜单关联
     * @param roleId
     * @return
     */
    public int deleteRoleMenuByRoleId(Long roleId);

    /**
     * 批量删除角色菜单信息
     * @param ids
     * @return
     */
    public int batchDelteRoleMenu(Long[] ids);

    /**
     * 查询菜单使用数量
     * @param menu
     * @return
     */
    public int selectCountRoleMenu(Long menyId);

    /**
     * 批量增加角色菜单信息
     * @param roleMenuList
     * @return
     */
    public int insertBatchRoleMenu(List<RoleMenu> roleMenuList);

}
