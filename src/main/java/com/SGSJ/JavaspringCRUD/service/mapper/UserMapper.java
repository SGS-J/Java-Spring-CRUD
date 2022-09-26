package com.SGSJ.JavaspringCRUD.service.mapper;

import com.SGSJ.JavaspringCRUD.domain.User;
import com.SGSJ.JavaspringCRUD.persistence.entities.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mappings({
            @Mapping(source = "IdUsuario", target = "userId"),
            @Mapping(source = "Nombre", target = "name"),
            @Mapping(source = "Contraseña", target = "password"),
            @Mapping(source = "Edad", target = "userId"),
            @Mapping(source = "Correo", target = "email")
    })
    User toUser(Usuario usuario);
    List<User> toUsers(List<Usuario> usuarios);

    @InheritInverseConfiguration
    Usuario toUsuario(User user);
}
