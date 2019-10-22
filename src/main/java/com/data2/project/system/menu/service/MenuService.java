package com.data2.project.system.menu.service;

import com.data2.project.system.menu.entity.Menu;

import java.util.List;

/**
 * 业务层 menu
 */
public interface MenuService {

    /**
     * 查询所有菜单
     * @return
     */
    public List<Menu> selectAllMenu();

    /**
     * 查询出按钮以外的目录及菜单
     * @return
     */
    public List<Menu> selectMenusExceptBtn();

    /**
     * 根据用户id查询菜单
     * @param userId
     * @return
     */
    public List<Menu> selectMenusByUserId(Long userId);
}
