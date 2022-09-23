package com.SGSJ.JavaspringCRUD.persistence.crud;

import com.SGSJ.JavaspringCRUD.persistence.entities.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioCrudRepository extends CrudRepository<Usuario, Long> {
}
