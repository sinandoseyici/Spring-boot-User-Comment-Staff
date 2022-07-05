package com.codebooth.springusercommentstaff.userCommentPackage.controller;

import com.codebooth.springusercommentstaff.userCommentPackage.dto.UserCommentDto;
import com.codebooth.springusercommentstaff.userCommentPackage.dto.UserCommentSaveRequestDto;
import com.codebooth.springusercommentstaff.userCommentPackage.dto.UserCommentUpdateRequestDto;
import com.codebooth.springusercommentstaff.userCommentPackage.service.UserCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/comments")
@RequiredArgsConstructor
public class UserCommentController {

    private final UserCommentService userCommentService;

    @GetMapping
    public List<UserCommentDto> findAll() {
        List<UserCommentDto> userCommentDtoList = userCommentService.findAll();

        return userCommentDtoList;
    }

    @PostMapping
    public UserCommentDto save(@RequestBody UserCommentSaveRequestDto userCommentSaveRequestDto){
        UserCommentDto userCommentDto = userCommentService.save(userCommentSaveRequestDto);

        return userCommentDto;
    }

    @DeleteMapping
    public UserCommentDto update(@RequestBody UserCommentUpdateRequestDto userCommentUpdateRequestDto){
        UserCommentDto userCommentDto = userCommentService.update(userCommentUpdateRequestDto);

        return userCommentDto;
    }
}
