package com.SGSJ.JavaspringCRUD.model.Users;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UsersCrud extends CrudRepository<Users, Long> {
    @Query(value = "SELECT * FROM usuario ORDER BY Nombre ASC", nativeQuery = true)
    List<Users> findAllOrdered();
    @Query(value = "SELECT * FROM usuario WHERE Email=?1", nativeQuery = true)
    Optional<Users> findByEmail(String email);
}
