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

    public User toUser(Users usuario) {
        return mapper.toUser(usuario);
    }

    public List<User> toUsers(List<Users> usuario) {
        return mapper.toUsers(usuario);
    }

    public Users toUsuario(User user) {
        return mapper.toUsuario(user);
    }

    public List<Users> toUsuarios(List<User> users) {
        return mapper.toUsuarios(users);
    }
}
