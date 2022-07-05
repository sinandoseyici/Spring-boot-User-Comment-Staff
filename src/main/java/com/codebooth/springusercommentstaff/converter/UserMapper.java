package com.codebooth.springusercommentstaff.converter;


import com.codebooth.springusercommentstaff.dto.UserDto;
import com.codebooth.springusercommentstaff.dto.UserSaveRequestDto;
import com.codebooth.springusercommentstaff.dto.UserUpdateRequestDto;
import com.codebooth.springusercommentstaff.user.User;
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