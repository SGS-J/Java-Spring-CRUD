package com.SGSJ.JavaspringCRUD.persistence;

import com.SGSJ.JavaspringCRUD.domain.User;
import com.SGSJ.JavaspringCRUD.domain.dto.UserDTO;
import com.SGSJ.JavaspringCRUD.persistence.crud.UsuarioCrudRepository;
import com.SGSJ.JavaspringCRUD.persistence.entities.Usuario;
import com.SGSJ.JavaspringCRUD.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UsuarioRepository implements UserDTO {
    private final UsuarioCrudRepository usuarioCrudRepository;
    private final UserMapper mapper;

    @Autowired
    public UsuarioRepository(UsuarioCrudRepository usuarioCrudRepository, UserMapper mapper) {
        this.usuarioCrudRepository = usuarioCrudRepository;
        this.mapper = mapper;
    }

    public List<User> getAll() {
        return mapper.toUsers((List<Usuario>) usuarioCrudRepository.findAll());
    }

    public List<User> getAllOrdered() {
        return mapper.toUsers(usuarioCrudRepository.findAllOrderByAsc());
    }

    public Optional<User> getById(long usuarioId) {
         return usuarioCrudRepository.findById(usuarioId).map( usuario -> mapper.toUser(usuario));
    }

    @Override
    public User save(User user) {
        return mapper.toUser(usuarioCrudRepository.save(mapper.toUsuario(user)));
    }

    @Override
    public void delete(long usuarioId) { usuarioCrudRepository.deleteById(usuarioId); }
}
