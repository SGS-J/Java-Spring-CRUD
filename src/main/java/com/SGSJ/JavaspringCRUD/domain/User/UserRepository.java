package com.SGSJ.JavaspringCRUD.domain.User;

import com.SGSJ.JavaspringCRUD.model.User.Usuario;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository {
    List<User> getAll();
    List<User> getAllOrdered();
    Optional<User> getById(long userId);
    User save(User user);
    User update(User user, long userId);
    void delete(long userId);
}
