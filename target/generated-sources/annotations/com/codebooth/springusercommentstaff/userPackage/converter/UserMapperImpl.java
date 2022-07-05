package com.codebooth.springusercommentstaff.userPackage.converter;

import com.codebooth.springusercommentstaff.userPackage.dto.UserDto;
import com.codebooth.springusercommentstaff.userPackage.dto.UserSaveRequestDto;
import com.codebooth.springusercommentstaff.userPackage.dto.UserUpdateRequestDto;
import com.codebooth.springusercommentstaff.userPackage.user.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-06T00:13:47+0300",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 17.0.3.1 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto convertToUserDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setName( user.getName() );
        userDto.setSurname( user.getSurname() );
        userDto.setEmail( user.getEmail() );
        userDto.setPhoneNumber( user.getPhoneNumber() );
        userDto.setBirthdate( user.getBirthdate() );

        return userDto;
    }

    @Override
    public List<UserDto> convertToUserDtoList(List<User> userList) {
        if ( userList == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( userList.size() );
        for ( User user : userList ) {
            list.add( convertToUserDto( user ) );
        }

        return list;
    }

    @Override
    public User convertToUser(UserSaveRequestDto userSaveRequestDto) {
        if ( userSaveRequestDto == null ) {
            return null;
        }

        User user = new User();

        user.setId( userSaveRequestDto.getId() );
        user.setName( userSaveRequestDto.getName() );
        user.setSurname( userSaveRequestDto.getSurname() );
        user.setEmail( userSaveRequestDto.getEmail() );
        user.setBirthdate( userSaveRequestDto.getBirthdate() );

        return user;
    }

    @Override
    public User convertToUser(UserUpdateRequestDto userUpdateRequestDto) {
        if ( userUpdateRequestDto == null ) {
            return null;
        }

        User user = new User();

        user.setId( userUpdateRequestDto.getId() );
        user.setSurname( userUpdateRequestDto.getSurname() );
        user.setEmail( userUpdateRequestDto.getEmail() );

        return user;
    }
}
