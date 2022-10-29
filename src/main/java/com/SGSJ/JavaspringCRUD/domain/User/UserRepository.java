package com.SGSJ.JavaspringCRUD.domain.User;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository {
    List<User> getAll();
    List<User> getAllOrdered();
    Optional<User> getById(long userId);
    Optional<User> getByEmail(String email);
    User save(User user);
    User update(User user, long userId);
    Optional<User>logIn(String email, String password);
    void logOut();
    void delete(long userId);
}
