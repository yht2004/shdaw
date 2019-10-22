package com.data2.project.system.user.entity;

/**
 * 用户岗位关联
 */
public class UserPost {
    private long userId;
    private long postId;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserPost{");
        sb.append("userId=").append(userId);
        sb.append(", postId=").append(postId);
        sb.append('}');
        return sb.toString();
    }
}
