package com.SGSJ.JavaspringCRUD.persistence.crud;

import com.SGSJ.JavaspringCRUD.persistence.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioCrudRepository extends CrudRepository<Usuario, Long> {
    List<Usuario> findAllOrderByAsc();
}
