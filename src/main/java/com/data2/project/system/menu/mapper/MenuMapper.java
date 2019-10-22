package com.data2.project.system.menu.mapper;

import com.data2.project.system.menu.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 数据层sys_menu
 */
@Mapper
public interface MenuMapper {

    /**
     * 查询所有菜单
     * @return
     */
    public List<Menu> selectAllMenu();

    /**
     * 查询目录及菜单，除按钮以外 除外
     * @return
     */
    public List<Menu> selectMenusExceptBtn();

    /**
     * 根据用户id查询菜单
     * @param userId
     * @return
     */
    public List<Menu> selectMenusByUserId(Long userId);

    /**
     * 检擦菜单名称是否唯一
     * @param menuName
     * @return
     */
    public Menu checkMenuNameUnique(String menuName);

}
