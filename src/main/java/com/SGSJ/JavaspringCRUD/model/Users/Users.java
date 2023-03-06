package com.SGSJ.JavaspringCRUD.model.Users;

import com.SGSJ.JavaspringCRUD.model.Images.Images;
import com.SGSJ.JavaspringCRUD.model.Passwords.Passwords;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;
    private String userName;
    private Integer age;
    @NotNull
    private String email;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Passwords userPassword;
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Images> images;

    public Users() {
    }

    public Users(Long userId, String userName, Passwords userPassword, int age, String email, List<Images> images) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.age = age;
        this.email = email;
        this.images = images;
    }

    public List<Images> getImages() {
        return images;
    }

    public void setImages(List<Images> images) {
        this.images = images;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Passwords getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(Passwords userPassword) {
        this.userPassword = userPassword;
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


