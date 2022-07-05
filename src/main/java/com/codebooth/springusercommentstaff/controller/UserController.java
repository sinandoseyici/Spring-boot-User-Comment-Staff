package com.codebooth.springusercommentstaff.controller;

import com.codebooth.springusercommentstaff.dto.UserDto;
import com.codebooth.springusercommentstaff.dto.UserSaveRequestDto;
import com.codebooth.springusercommentstaff.dto.UserUpdateRequestDto;
import com.codebooth.springusercommentstaff.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Rest controller olduğunun anlaşılması için etiket.
@RequestMapping("/api/v1/users") //Best practice'lere göre path'in verilmesi.
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserDto> findAll() {
        List<UserDto> userDtoList = userService.findAll();

        return userDtoList;
    }

    @GetMapping("/{id}")
    public UserDto findById(@PathVariable Long id){
        UserDto userDto = userService.findById(id);
        return userDto;
    }

    @PostMapping
    public UserDto save(@RequestBody UserSaveRequestDto userSaveRequestDto){

        UserDto userDto = userService.save(userSaveRequestDto);

        return userDto;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        userService.delete(id);
    }

    @PutMapping
    public UserDto update(@RequestBody UserUpdateRequestDto userUpdateRequestDto){
        UserDto userDto = userService.update(userUpdateRequestDto);

        return userDto;
    }
}
