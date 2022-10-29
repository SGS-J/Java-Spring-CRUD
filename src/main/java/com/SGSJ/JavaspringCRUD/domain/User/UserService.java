package com.SGSJ.JavaspringCRUD.domain.User;

import com.SGSJ.JavaspringCRUD.model.User.Usuario;
import com.SGSJ.JavaspringCRUD.model.User.UsuarioCrud;
import com.SGSJ.JavaspringCRUD.security.Encrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserRepository {
    private UsuarioCrud usuarioCrud;
    private UserDTO userDto;

    @Autowired public UserService(UsuarioCrud usuarioCrud, UserDTO userDto) {
        this.usuarioCrud = usuarioCrud;
        this.userDto = userDto;
    }

    @Override
    public List<User> getAll() {
        return userDto.toUsers((List<Usuario>) usuarioCrud.findAll());
    }

    @Override
    public List<User> getAllOrdered() {
        return userDto.toUsers(usuarioCrud.findAllOrdered());
    }

    @Override
    public Optional<User> getById(long userId) {
        return usuarioCrud.findById(userId).map(user -> userDto.toUser(user));
    }

    @Override
    public Optional<User> getByEmail(String email) {
        Optional<Usuario> usuario = usuarioCrud.findByEmail(email);
        if(usuario.isEmpty()) {
            return Optional.empty();
        }
        User user = userDto.toUser(usuario.get());
        return Optional.of(user);
    }

    @Override
    synchronized public User save(User user) {
        String password = user.getPassword();
        String salt = Encrypt.getSalt(10);
        String hash = Encrypt.generateStringHash(password, salt);
        user.setPassword(hash);
        return userDto.toUser(usuarioCrud.save(userDto.toUsuario(user)));
    }

    @Override
    public User update(User user, long userId) {
        User userNew = getById(userId).get();

        userNew.setName(user.getName() == null ? userNew.getName() : user.getName());
        userNew.setPassword(user.getPassword() == null ? userNew.getPassword() : user.getPassword());
        userNew.setAge(Integer.valueOf(user.getAge()) == null ? userNew.getAge() : user.getAge());
        userNew.setEmail(user.getEmail() == null ? userNew.getEmail() : user.getEmail());

        usuarioCrud.save(userDto.toUsuario(userNew));
        return userNew;
    }

    @Override
    synchronized public Optional<User> logIn(String email, String password) {
        Optional<User> user = getByEmail(email);
        if(user.isEmpty()) {
            return Optional.empty();
        }

        String salt = password.substring(0, 10);
        String storedPasword = user.get().getPassword();
        boolean passwordMatch = Encrypt.verifyStringHash(password, storedPasword, salt);

        if(passwordMatch) {
            return user;
        }

        return Optional.empty();
    }

    @Override
    public void logOut() {
    }

    @Override
    public void delete(long userId) {
        usuarioCrud.deleteById(userId);
    }
}
