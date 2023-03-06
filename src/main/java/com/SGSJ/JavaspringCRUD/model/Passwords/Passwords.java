package com.SGSJ.JavaspringCRUD.model.Passwords;

import com.SGSJ.JavaspringCRUD.model.Users.Users;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "passwords")
public class Passwords {

    @Id
    private String passHash;
    @NotNull
    private String passSalt;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userPassword")
    private Users user;

    public Passwords () {
    }

    public Passwords(String passHash, String passSalt, Users user) {
        this.passHash = passHash;
        this.passSalt = passSalt;
        this.user = user;
    }

    public String getPassHash() {
        return passHash;
    }

    public void setPassHash(String passHash) {
        this.passHash = passHash;
    }

    public String getPassSalt() {
        return passSalt;
    }

    public void setPassSalt(String passSalt) {
        this.passSalt = passSalt;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
