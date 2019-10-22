package com.data2.project.system.user.mapper;

import com.data2.project.system.user.entity.UserPost;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户岗位关联 数据层
 */
@Mapper
public interface UserPostMapper {

    /**
     * 通过用户ID删除用户岗位关联
     * @param userId
     * @return
     */
    public int deleteUserPostByUserId(Long userId);

    /**
     * 批量删除用户岗位
     * @param UserIds
     * @return
     */
    public int batchDeleteUserPost(Long[] UserIds);

    /**
     * 通过岗位ID查询岗位使用数量
     * @param postId
     * @return
     */
    public int selectCountPostByPostId(Long postId);

    /**
     * 批量增加用户岗位信息
     * @param postList
     * @return
     */
    public int batchAddListUserPost(List<UserPost> postList);
}
