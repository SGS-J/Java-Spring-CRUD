package com.SGSJ.JavaspringCRUD.domain.Image;

import com.SGSJ.JavaspringCRUD.domain.User.User;

public class Image {
    private Long imageId;
    private String imageUrl;
    private User user;

    public Image () {
    }
    public Image(Long imageId, String imageUrl, User user) {
        this.imageId = imageId;
        this.imageUrl = imageUrl;
        this.user = user;
    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
