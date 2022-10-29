package com.SGSJ.JavaspringCRUD.model.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioCrud extends CrudRepository<Usuario, Long> {
    @Query(value = "SELECT * FROM usuario ORDER BY Nombre ASC", nativeQuery = true)
    List<Usuario> findAllOrdered();
    @Query(value = "SELECT * FROM usuario WHERE Email=?1", nativeQuery = true)
    Optional<Usuario> findByEmail(String email);
}
