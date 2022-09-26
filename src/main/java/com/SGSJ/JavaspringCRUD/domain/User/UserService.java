package com.SGSJ.JavaspringCRUD.domain.User;

import com.SGSJ.JavaspringCRUD.model.User.Usuario;
import com.SGSJ.JavaspringCRUD.model.User.UsuarioCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserRepository {
    private final UsuarioCrud usuarioCrud;
    private final UserDTO userDto;

    @Autowired
    public UserService(UsuarioCrud usuarioCrud, UserDTO userDto) {
        this.usuarioCrud = usuarioCrud;
        this.userDto = userDto;
    }

    @Override
    public List<User> getAll() {
        return userDto.toUsers((List<Usuario>) usuarioCrud.findAll());
    }

    @Override
    public List<User> getAllOrdered() {
        return userDto.toUsers(usuarioCrud.findAllOrderByAsc());
    }

    @Override
    public Optional<User> getById(long userId) {
        return usuarioCrud.findById(userId).map(user -> userDto.toUser(user));
    }

    @Override
    public User save(User user) {
        return userDto.toUser(usuarioCrud.save(userDto.toUsuario(user)));
    }

    @Override
    public User update(User user, long userId) {
        User userNew = getById(userId).get();

        userNew.setName(user.getName());
        userNew.setPassword(user.getPassword());
        userNew.setAge(user.getAge());
        userNew.setEmail(user.getEmail());

        usuarioCrud.save(userDto.toUsuario(userNew));
        return userNew;
    }

    @Override
    public void delete(long userId) {
        usuarioCrud.deleteById(userId);
    }
}
