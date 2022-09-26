package com.SGSJ.JavaspringCRUD.model.User;

import com.SGSJ.JavaspringCRUD.domain.User.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    @Mappings({
            @Mapping(source = "idUsuario", target = "userId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "contraseña", target = "password"),
            @Mapping(source = "edad", target = "age"),
            @Mapping(source = "correo", target = "email")
    })
    User toUser(Usuario usuario);
    List<User> toUsers(List<Usuario> usuarios);

    @InheritInverseConfiguration
    Usuario toUsuario(User user);
    List<Usuario> toUsuarios(List<User> users);
}
