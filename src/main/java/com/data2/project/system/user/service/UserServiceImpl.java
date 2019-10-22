package com.data2.project.system.user.service;

import com.data2.project.system.user.entity.User;
import com.data2.project.system.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务处理
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUserList(User user) {
        List<User> users = userMapper.selectUserList(user);
        return users;
    }

    /**
     * 根据ID查询用户
     * @param userId
     * @return
     */
    @Override
    public User selectUserByUserId(Long userId) {
        User user = userMapper.selectUserByUserId(userId);
        return user;
    }

    /**
     * 根据登录名查询用户
     * @param loginName
     * @return
     */
    @Override
    public User selectUserByLoginName(String loginName) {
        User user = userMapper.selectUserByLoginName(loginName);
        return user;
    }

    /**
     * 根据邮箱查询用户
     * @param email
     * @return
     */
    @Override
    public User selectUserByEmail(String email) {
        return null;
    }

    /**
     * 根据手机号查询用户
     * @param phoneNumber
     * @return
     */
    @Override
    public User selectUserByPhoneNumber(String phoneNumber) {
        return null;
    }

    /**
     * 根据用户ID删除用户
     * @param userId
     * @return
     */
    @Override
    public int deleteUserByUserId(Long userId) {
        return 0;
    }

    /**
     * 批量删除用户
     * @param ids
     * @return
     */
    @Override
    public int batchDeleteUser(Long[] ids) {
        return 0;
    }

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public int resetPassword(String password) {
        return 0;
    }


    /**
     * 保存用户信息
     * @param user
     * @return
     */
    @Override
    public int insertUser(User user) {
        return 0;
    }

    /**
     * 验证登录名是否唯一
     * @param loginName
     * @return
     */
    @Override
    public int checkLoginNameUnique(String loginName) {
        return 0;
    }

    /**
     * 验证邮箱是否唯一
     * @param email
     * @return
     */
    @Override
    public User checkEmailUnique(String email) {
        return null;
    }

    /**
     * 验证手机号是否唯一
     * @param phoneNumber
     * @return
     */
    @Override
    public User checkPhoneNumberUnique(String phoneNumber) {
        return null;
    }

    /**
     * 根据用户ID查询用户所在用户组
     * @param userId
     * @return
     */
    @Override
    public String selectUserRoleGroup(Long userId) {
        return null;
    }

    /**
     * 根据用户ID查询用户所在岗位组
     * @param userId
     * @return
     */
    @Override
    public String selectUserPostGroup(Long userId) {
        return null;
    }


}
