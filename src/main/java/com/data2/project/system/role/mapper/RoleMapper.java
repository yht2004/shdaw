package com.data2.project.system.role.mapper;

import com.data2.project.system.role.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 数据层 role
 */
@Mapper
public interface RoleMapper {

    /**
     *根据条件分页查询角色数据
     * @param role
     * @return
     */
    public List<Role> selectRoleList(Role role);

    /**
     * 根据用户ID查询角色
     * @param userId
     * @return
     */
    public List<Role> selectRoleByUserId(Long userId);

    /**
     * 查询角色列表
     * @return
     */
    public List<Role> selectRoleAll();

    /**
     * 根据角色ID查询角色
     * @param roleId
     * @return
     */
    public List<Role> selectRoleByRoleId(Long roleId);

    /**
     * 根据角色ID删除角色
     * @param roleId
     * @return
     */
    public int deleteRoleByRoleId(Long roleId);

    /**
     * 批量删除角色
     * @param ids
     * @return
     */
    public int batchDeleteRole(Long[] ids);

    /**
     * 修改角色信息
     * @param role
     * @return
     */
    public int updateRole(Role role);

    /**
     * 添加角色信息
     * @param role
     * @return
     */
    public int addRole(Role role);

    /**
     * 校验角色名是否唯一
     * @param roleName
     * @return
     */
    public Role checkRoleNameUnique(String roleName);
}
