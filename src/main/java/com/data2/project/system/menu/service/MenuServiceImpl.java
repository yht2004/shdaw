package com.data2.project.system.menu.service;

import com.data2.common.utils.TreeUtils;
import com.data2.project.system.menu.entity.Menu;
import com.data2.project.system.menu.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务处理
 */
@Service
public class MenuServiceImpl implements MenuService{

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> selectAllMenu() {
        return menuMapper.selectAllMenu();
    }

    @Override
    public List<Menu> selectMenusExceptBtn() {
        menuMapper.selectMenusExceptBtn();
        return null;
    }

    @Override
    public List<Menu> selectMenusByUserId(Long userId) {
        List<Menu> menus = menuMapper.selectMenusByUserId(userId);
        return TreeUtils.getchildListByParentId(menus,0);
    }

}
