package com.data2.project.system.post.mapper;

import com.data2.project.system.post.entity.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 岗位表  数据层
 */
@Mapper
public interface PostMapper {

    /**
     * 查询岗位数据集合
     * @param post
     * @return
     */
    public List<Post> selectPostList(Post post);


    /**
     * 查询所有岗位
     * @return
     */
    public List<Post> selectPostAll();

    /**
     * 根据用户ID查询岗位
     * @param userId
     * @return
     */
    public List<Post> selectPostByUserId(Long userId);

    /**
     * 根据岗位ID查询岗位
     * @param postId
     * @return
     */
    public Post selectPostByPostId(Long postId);

    /**
     * 根据岗位ID删除岗位信息
     * @param postId
     * @return
     */
    public int deletePostByPostId(Long postId);

    /**
     * 批量删除岗位信息
     * @param ids
     * @return
     */
    public int batchDeletePost(Long[] ids);

    /**
     * 修改岗位信息
     * @param post
     * @return
     */
    public int updatePost(Post post);

    /**
     * 添加岗位信息
     * @param post
     * @return
     */
    public int insetPost(Post post);


}
