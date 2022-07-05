package com.codebooth.springusercommentstaff.service;

import com.codebooth.springusercommentstaff.converter.UserMapper;
import com.codebooth.springusercommentstaff.dto.UserDto;
import com.codebooth.springusercommentstaff.dto.UserSaveRequestDto;
import com.codebooth.springusercommentstaff.dto.UserUpdateRequestDto;
import com.codebooth.springusercommentstaff.service.entitiyservice.UserEntityService;
import com.codebooth.springusercommentstaff.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserEntityService userEntityService;

    public List<UserDto> findAll() {
        List<User> userList = userEntityService.findAll();

        List<UserDto> userDtoList = UserMapper.INSTANCE.convertToUserDtoList(userList);

        return userDtoList;
    }

    public UserDto findById(Long id) {
        Optional<User> optionalUser = userEntityService.findById(id);

        if(!optionalUser.isPresent()){
            return null;
        }

        User user = optionalUser.get();

        UserDto userDto = UserMapper.INSTANCE.convertToUserDto(user);

        return userDto;
    }

    public UserDto findByIdWithControl(Long id) {
        User user = userEntityService.findById(id).orElseThrow();

        UserDto userDto = UserMapper.INSTANCE.convertToUserDto(user);

        return userDto;
    }

    public UserDto save(UserSaveRequestDto userSaveRequestDto){
        User user = UserMapper.INSTANCE.convertToUser(userSaveRequestDto);

        user = userEntityService.save(user);

        UserDto userDto = UserMapper.INSTANCE.convertToUserDto(user);

        return userDto;
    }

    public void delete(Long id){
        userEntityService.delete(id);
    }

    public UserDto update(UserUpdateRequestDto userUpdateRequestDto){

        boolean isExist = userEntityService.isExist(userUpdateRequestDto.getId());

        if (!isExist){
            throw new RuntimeException("User doesn't exist !");
        }

        User user = UserMapper.INSTANCE.convertToUser(userUpdateRequestDto);

        user = userEntityService.save(user);

        UserDto userDto = UserMapper.INSTANCE.convertToUserDto(user);

        return userDto;
    }

}
