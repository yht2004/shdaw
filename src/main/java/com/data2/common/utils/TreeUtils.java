package com.data2.common.utils;

import com.data2.project.system.menu.entity.Menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 权限数据处理
 */
public class TreeUtils {

    /**
     * 根据传入的父Id获取子节点
     * @param list
     * @param parentId
     * @return
     */
    public static List<Menu> getchildListByParentId(List<Menu> list,int parentId){
        List<Menu> returnList = new ArrayList<Menu>();
        for (Iterator<Menu> it = list.iterator();it.hasNext();){
            Menu t = (Menu) it.next();
            if (t.getParentId() == parentId){
                recursionfn(list,t);
                returnList.add(t);
            }
        }

        return returnList;
    }



    /**
     * 得到子节点列表
     * @param list
     * @param t
     * @return
     */
    public static List<Menu> getMenuChildrenList(List<Menu> list,Menu t){

        List<Menu> tlist = new ArrayList<Menu>();
        Iterator<Menu> iterator = list.iterator();
        while (iterator.hasNext()){
            Menu n = (Menu) iterator.next();
            if (n.getParentId().longValue() == t.getMenuId().longValue()){
                tlist.add(n);
            }
        }

        return tlist;
    }


    /**
     * 递归子节点列表
     */
    public static void recursionfn(List<Menu> list,Menu t){
        //得到所有子节点列表
        List<Menu> menuChildrenList = getMenuChildrenList(list, t);
        t.setChildren(menuChildrenList);
        for (Menu tchild : menuChildrenList){
            if (hasChild(list,tchild)){
                Iterator<Menu> it = menuChildrenList.iterator();
                while (it.hasNext()){
                    Menu n = (Menu) it.next();
                    recursionfn(list,n);
                }
            }
        }
    }


    /**
     * 判断是否有子节点
     * @param list
     * @param t
     * @return
     */
    public static boolean hasChild(List<Menu> list,Menu t){
        return getMenuChildrenList(list,t).size() > 0 ? true : false;
    }
}
