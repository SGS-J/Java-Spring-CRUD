package com.SGSJ.JavaspringCRUD.model.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioCrud extends CrudRepository<Usuario, Long> {
    @Query(value = "SELECT * FROM usuario ORDER BY Nombre ASC", nativeQuery = true)
    List<Usuario> findAllOrdered();
}
