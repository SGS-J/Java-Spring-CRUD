package com.SGSJ.JavaspringCRUD.domain.User;

import com.SGSJ.JavaspringCRUD.model.Users.Users;
import com.SGSJ.JavaspringCRUD.model.Users.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserDTO {

    @Autowired
    private UsersMapper mapper;

    public User toUserDomain(Users user) {
        return mapper.toUserDomain(user);
    }

    public List<User> toUsersDomain(List<Users> users) {
        return mapper.toUsersDomain(users);
    }

    public Users toUserModel(User user) {
        return mapper.toUserModel(user);
    }

    public List<Users> toUsersModel(List<User> users) {
        return mapper.toUsersModel(users);
    }
}
