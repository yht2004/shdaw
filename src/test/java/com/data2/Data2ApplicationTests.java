package com.data2;

import com.data2.project.system.menu.entity.Menu;
import com.data2.project.system.menu.service.MenuService;
import com.data2.project.system.role.entity.Role;
import com.data2.project.system.role.mapper.RoleMapper;
import com.data2.project.system.user.entity.User;
import com.data2.project.system.user.mapper.UserMapper;
import com.data2.project.system.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Data2ApplicationTests {

    @Autowired
    RoleMapper roleMapper;

    @Autowired
    UserMapper userMapper;

    @Autowired
    MenuService menuService;

    @Autowired
    UserService userService;

    public static void listFile(File file){
        File[] files = file.listFiles();
        for (int i = 0;i <files.length;i++){
            if (files[i].isDirectory()){
                listFile(files[i]);
                System.out.println("目录="+files[i].getName());
            }else {
                System.out.println("文件="+files[i].getName());
            }
        }
    }

    public static int recursion(int n){
        if (n ==1 ){
            return 1;
        }else {
            return n*recursion(n-1);
        }
    }



    @Test
    public void contextLoads() {

        List<Role> roleList = roleMapper.selectRoleByUserId(1l);
        for (Role role :roleList){
            System.out.println(role.getRoleName());
        }
    }


    @Test
    public void chenckEmailUnique() {

        User user = userMapper.checkEmailUnique("ry@qq.com");
        System.out.println(user.getEmail());
    }

    @Test
    public void checkPhoneNumberUnique() {

        User user = userMapper.checkPhoneNumberUnique("15888888888");
        System.out.println(user.getUserId());
    }


    @Test
    public void selectRoleByUserId() {
        List<Role> roleList = roleMapper.selectRoleByUserId(1l);
        for (Role role :roleList){
            System.out.println(role.getRoleName());
        }
    }
}
