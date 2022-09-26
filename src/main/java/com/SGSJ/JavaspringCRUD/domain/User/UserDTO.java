package com.SGSJ.JavaspringCRUD.domain.User;

import com.SGSJ.JavaspringCRUD.model.User.Usuario;
import com.SGSJ.JavaspringCRUD.model.User.UsuarioMapper;

import java.util.List;

public class UserDTO {
    private UsuarioMapper mapper;

    public User toUser(Usuario usuario) {
        return mapper.toUser(usuario);
    }

    public List<User> toUsers(List<Usuario> usuario) {
        return mapper.toUsers(usuario);
    }

    public Usuario toUsuario(User user) {
        return mapper.toUsuario(user);
    }

    public List<Usuario> toUsuarios(List<User> users) {
        return mapper.toUsuarios(users);
    }
}
