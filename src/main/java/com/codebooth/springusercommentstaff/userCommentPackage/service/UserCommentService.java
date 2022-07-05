package com.codebooth.springusercommentstaff.userCommentPackage.service;

import com.codebooth.springusercommentstaff.userCommentPackage.converter.UserCommentMapper;
import com.codebooth.springusercommentstaff.userCommentPackage.dto.UserCommentDto;
import com.codebooth.springusercommentstaff.userCommentPackage.dto.UserCommentSaveRequestDto;
import com.codebooth.springusercommentstaff.userCommentPackage.dto.UserCommentUpdateRequestDto;
import com.codebooth.springusercommentstaff.userCommentPackage.service.entityservice.UserCommentEntityService;
import com.codebooth.springusercommentstaff.userCommentPackage.usercomment.UserComment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserCommentService {

    private final UserCommentEntityService userCommentEntityService;

    public List<UserCommentDto> findAll() {
        List<UserComment> userCommentList = userCommentEntityService.findAll();

        List<UserCommentDto> userCommentDtoList = UserCommentMapper.INSTANCE_COMMENT.convertToUserCommentDtoList(userCommentList);

        return userCommentDtoList;
    }

    public UserCommentDto save(UserCommentSaveRequestDto userCommentSaveRequestDto){
        UserComment userComment = UserCommentMapper.INSTANCE_COMMENT.convertToUserComment(userCommentSaveRequestDto);

        userComment = userCommentEntityService.save(userComment);

        UserCommentDto userCommentDto = UserCommentMapper.INSTANCE_COMMENT.convertToUserCommentDto(userComment);

        return userCommentDto;
    }

    public void delete(Long id){
        userCommentEntityService.delete(id);
    }

    public UserCommentDto update(UserCommentUpdateRequestDto userCommentUpdateRequestDto){

        UserComment userComment = UserCommentMapper.INSTANCE_COMMENT.convertToUserComment(userCommentUpdateRequestDto);

        userComment = userCommentEntityService.save(userComment);

        UserCommentDto userCommentDto = UserCommentMapper.INSTANCE_COMMENT.convertToUserCommentDto(userComment);

        return userCommentDto;
    }
}
