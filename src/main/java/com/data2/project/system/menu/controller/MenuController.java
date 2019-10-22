package com.data2.project.system.menu.controller;

import com.data2.project.system.menu.entity.Menu;
import com.data2.project.system.menu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/index")
    public String index(Model model){
        List<Menu> menus = menuService.selectAllMenu();
        model.addAttribute("menus",menus);
        return "index";
    }
}
