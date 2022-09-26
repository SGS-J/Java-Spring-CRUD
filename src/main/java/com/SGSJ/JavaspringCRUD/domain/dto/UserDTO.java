package com.SGSJ.JavaspringCRUD.domain.dto;

import com.SGSJ.JavaspringCRUD.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserDTO {
    List<User> getAll();
    List<User> getAllOrdered();
    Optional<User> getById(long userId);
    User save(User user);
    void delete(long userId);
}
