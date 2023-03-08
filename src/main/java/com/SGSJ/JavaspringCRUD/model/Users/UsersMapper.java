package com.SGSJ.JavaspringCRUD.model.Users;

import com.SGSJ.JavaspringCRUD.domain.User.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsersMapper {
    @Mappings({
            @Mapping(source = "userId", target = "userId"),
            @Mapping(source = "userName", target = "name"),
            @Mapping(source = "userPassword", target = "password"),
            @Mapping(source = "age", target = "age"),
            @Mapping(source = "email", target = "email"),
    })
    User toUserDomain(Users user);
    List<User> toUsersDomain(List<Users> users);

    @InheritInverseConfiguration
    Users toUserModel(User user);
    List<Users> toUsersModel(List<User> users);
}
