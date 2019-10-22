package com.data2.project.system.user.service;

import com.data2.project.system.user.entity.User;

import java.util.List;

/**
 * 业务层
 */
public interface UserService {

    /**
     * 根据分页条件查询用户对象
     * @param user
     * @return
     */
    public List<User> selectUserList(User user);

    /**
     * 根据用户ID查询用户
     * @return
     */
    public User selectUserByUserId(Long userId);

    /**
     * 根据登陆名查询用户
     * @param loginName
     * @return
     */
    public User selectUserByLoginName(String loginName);

    /**
     * 根据邮箱查询用户
     * @param email
     * @return
     */
    public User selectUserByEmail(String email);

    /**
     * 根据电话号查询用户
     * @param email
     * @return
     */
    public User selectUserByPhoneNumber(String phoneNumber);

    /**
     * 根据用户ID删除用户
     * @return
     */
    public int deleteUserByUserId(Long userId);

    /**
     * 批量删除用户
     * @param ids
     * @return
     */
    public int batchDeleteUser(Long[] ids);

    /**
     * 修改用户
     * @param user
     * @return
     */
    public int updateUser(User user);

    /**
     * 修改密码
     * @param password
     * @return
     */
    public int resetPassword(String password);

    /**
     * 新增用户
     * @param user
     * @return
     */
    public int insertUser(User user);


    /**
     * 校验用户名是否唯一
     */
    public int checkLoginNameUnique(String loginName);

    /**
     * 校验邮箱是否唯一
     * @param email
     * @return
     */
    public User checkEmailUnique(String email);

    /**
     * 校验电话号是否唯一
     * @param phoneNumber
     * @return
     */
    public User checkPhoneNumberUnique(String phoneNumber);

    /**
     * 根据用户ID查询用户所属角色组
     * @param userId
     * @return
     */
    public String selectUserRoleGroup(Long userId);

    /**
     * 根据用户ID查询用户所属岗位组
     * @param userId
     * @return
     */
    public String selectUserPostGroup(Long userId);

}
