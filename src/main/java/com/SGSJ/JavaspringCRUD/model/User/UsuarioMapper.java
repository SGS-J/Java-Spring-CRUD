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
    List<Usuario> toUsuarios(List<User> users);
}
