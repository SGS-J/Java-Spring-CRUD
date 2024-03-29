package com.SGSJ.JavaspringCRUD.domain.User;

import org.springframework.stereotype.Component;

@Component
public class User {
    private Long userId;
    private String name;
    private String password;
    private int age;
    private String email;
    private String imageUp;

    public String getImageUp() {
        return imageUp;
    }

    public void setImageUp(String imageUp) {
        this.imageUp = imageUp;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
