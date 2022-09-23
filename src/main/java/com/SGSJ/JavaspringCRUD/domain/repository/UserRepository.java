package com.SGSJ.JavaspringCRUD.domain.repository;

import com.SGSJ.JavaspringCRUD.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<User> getAll();
    List<User> getAllOrdered();
    Optional<User> getById(long userId);
    User save(User user);
    void delete(long userId);
}
