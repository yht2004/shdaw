package com.data2.project.system.user.mapper;

import com.data2.project.system.user.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户角色关联 数据层
 */
@Mapper
public interface UserRoleMapper {

    /**
     * 通过用户ID删除用户角色关联
     * @param userId
     * @return
     */
    public int deleteUserRoleByUserId(Long userId);

    /**
     * 批量删除用户角色关联
     * @param ids
     * @return
     */
    public int deleteUserRole(Long[] ids);

    /**
     * 通过角色ID查询角色使用数量
     * @param roleId
     * @return
     */
    public int selectCountUserRoleByRoleId(Long roleId);

    /**
     * 批量新增用户角色信息
     * @param userRoleList
     * @return
     */
    public int batchUserRole(List<UserRole> userRoleList);
}
