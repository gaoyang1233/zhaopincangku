package com.work.common.vo;

/**
 * 收集用户的头像 用户名 ID 关注数量 粉丝数量 收藏数量 （帖子数量）
 * 收集用的达人属性, 用户粉丝数量 达人用户发布的菜品的收藏数量
 */
public class UserVo {

    private Integer id;

    private String username;

    private String img;

    private Integer uid;

    private Integer fid;

    private Integer proid;

    private Integer flag;

    //收藏
    private Integer collections;
    //我关注的
    private Integer follows;
    //粉丝
    private Integer fans;
    //发的帖子数量
    private Integer posts;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getProid() {
        return proid;
    }

    public void setProid(Integer proid) {
        this.proid = proid;
    }

    public Integer getCollections() {
        return collections;
    }

    public void setCollections(Integer collections) {
        this.collections = collections;
    }

    public Integer getFollows() {
        return follows;
    }

    public void setFollows(Integer follows) {
        this.follows = follows;
    }

    public Integer getFans() {
        return fans;
    }

    public void setFans(Integer fans) {
        this.fans = fans;
    }

    public Integer getPosts() {
        return posts;
    }

    public void setPosts(Integer posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", img='" + img + '\'' +
                ", uid=" + uid +
                ", fid=" + fid +
                ", proid=" + proid +
                ", collections=" + collections +
                ", follows=" + follows +
                ", fans=" + fans +
                ", posts=" + posts +
                '}';
    }


    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
