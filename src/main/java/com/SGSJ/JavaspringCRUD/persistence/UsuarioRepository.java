package com.SGSJ.JavaspringCRUD.persistence;

import com.SGSJ.JavaspringCRUD.persistence.crud.UsuarioCrudRepository;
import com.SGSJ.JavaspringCRUD.persistence.entities.Usuario;

import java.util.List;

public class UsuarioRepository  {
    private UsuarioCrudRepository usuarioCrudRepository;

    public List<Usuario> getAll() {
       return (List<Usuario>) usuarioCrudRepository.findAll();
    }
}
