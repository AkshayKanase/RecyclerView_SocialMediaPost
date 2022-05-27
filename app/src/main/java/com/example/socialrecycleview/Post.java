package com.example.socialrecycleview;

public class Post {
    private int postId;
    private String title;
    private int imageId;
    private int likesCount;
    private int likeImageId;

    public Post(int postId,String title, int imageId, int likesCount,int likeImageId) {
        this.postId=postId;
        this.title = title;
        this.imageId = imageId;
        this.likesCount = likesCount;
        this.likeImageId=likeImageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getLikeImageId() {
        return likeImageId;
    }

    public void setLikeImageId(int likeImageId) {
        this.likeImageId = likeImageId;
    }
}
