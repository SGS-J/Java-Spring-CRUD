package com.SGSJ.JavaspringCRUD.domain.User;

import com.SGSJ.JavaspringCRUD.model.Users.Users;
import com.SGSJ.JavaspringCRUD.model.Users.UsersCrud;
import com.SGSJ.JavaspringCRUD.security.Encrypt;
import com.SGSJ.JavaspringCRUD.security.SecurityUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserRepository {
    private UsersCrud usersCrud;
    private UserDTO userDto;
    private PasswordEncoder passwordEncoder;

    @Autowired public UserService(UsersCrud usersCrud, UserDTO userDto, PasswordEncoder passwordEncoder) {
        this.usersCrud = usersCrud;
        this.userDto = userDto;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public List<User> getAll() {
        return userDto.toUsersDomain((List<Users>) usersCrud.findAll());
    }

    @Override
    public List<User> getAllOrdered() {
        return userDto.toUsersDomain(usersCrud.findAllOrdered());
    }

    @Override
    public Optional<User> getById(long userId) {
        return usersCrud.findById(userId).map(user -> userDto.toUserDomain(user));
    }

    @Override
    public Optional<User> getByEmail(String email) {
        Optional<Users> usuario = usersCrud.findByEmail(email);
        if(usuario.isEmpty()) {
            return Optional.empty();
        }
        User user = userDto.toUserDomain(usuario.get());
        return Optional.of(user);
    }

    @Override
    public User save(User user) {
        String password = user.getPassword();
        String passwordHash = passwordEncoder.encode(password);
        user.setPassword(passwordHash);
        return userDto.toUserDomain(usersCrud.save(userDto.toUserModel(user)));
    }

    @Override
    public User update(User user, Long userId) {
        User userNew = getById(userId).get();

        userNew.setName(user.getName() == null ? userNew.getName() : user.getName());
        userNew.setPassword(user.getPassword() == null ? userNew.getPassword() : user.getPassword());
        userNew.setAge(Integer.valueOf(user.getAge()) == null ? userNew.getAge() : user.getAge());
        userNew.setEmail(user.getEmail() == null ? userNew.getEmail() : user.getEmail());

        usersCrud.save(userDto.toUserModel(userNew));
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
        usersCrud.deleteById(userId);
    }
}
