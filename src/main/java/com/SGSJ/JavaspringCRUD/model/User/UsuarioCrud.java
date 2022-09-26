package com.SGSJ.JavaspringCRUD.model.User;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioCrud extends CrudRepository<Usuario, Long> {
    List<Usuario> findAllOrderByAsc();
}
