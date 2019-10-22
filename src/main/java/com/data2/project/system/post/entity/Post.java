package com.data2.project.system.post.entity;

import com.data2.framework.web.entity.BaseEntity;

/**
 * 岗位对象
 */
public class Post extends BaseEntity {
    private static final long serialVersionUID = 1l;

    /**岗位ID*/
    private Long postId;
    /**岗位编码*/
    private String postCode;
    /**岗位名称*/
    private String postName;
    /**岗位排序*/
    private String postSort;
    /**状态（0正常，1停用）*/
    private int status;
    /**用户是否存在此岗位标识 默认不存在*/
    private boolean flag = false;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostSort() {
        return postSort;
    }

    public void setPostSort(String postSort) {
        this.postSort = postSort;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Post{");
        sb.append("postId=").append(postId);
        sb.append(", postCode='").append(postCode).append('\'');
        sb.append(", postName='").append(postName).append('\'');
        sb.append(", postSort='").append(postSort).append('\'');
        sb.append(", status=").append(status);
        sb.append(", flag=").append(flag);
        sb.append('}');
        return sb.toString();
    }
}
