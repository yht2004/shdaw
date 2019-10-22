package com.data2.project.system.user.mapper;

import com.data2.project.system.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 数据层 User
 */
@Mapper
public interface UserMapper {

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

}
