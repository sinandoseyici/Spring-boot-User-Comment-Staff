package com.codebooth.springusercommentstaff.userPackage.converter;


import com.codebooth.springusercommentstaff.userPackage.dto.UserDto;
import com.codebooth.springusercommentstaff.userPackage.dto.UserSaveRequestDto;
import com.codebooth.springusercommentstaff.userPackage.dto.UserUpdateRequestDto;
import com.codebooth.springusercommentstaff.userPackage.user.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDto convertToUserDto(User user);

    List<UserDto> convertToUserDtoList(List<User> userList);

    User convertToUser(UserSaveRequestDto userSaveRequestDto);

    User convertToUser(UserUpdateRequestDto userUpdateRequestDto);

}
