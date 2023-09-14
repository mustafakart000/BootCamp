package com.saferent.mapper;

import com.saferent.domain.User;
import com.saferent.dto.UserDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")//bu class' spring projemzden herhangi bir yerde enject' de edebileceğiz
public interface UserMapper {

    UserDTO userToUserDTO(User user);

    List<UserDTO> map(List<User>userList);
}
