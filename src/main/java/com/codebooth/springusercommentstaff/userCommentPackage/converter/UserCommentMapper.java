package com.codebooth.springusercommentstaff.userCommentPackage.converter;

import com.codebooth.springusercommentstaff.userCommentPackage.dto.UserCommentDto;
import com.codebooth.springusercommentstaff.userCommentPackage.dto.UserCommentSaveRequestDto;
import com.codebooth.springusercommentstaff.userCommentPackage.dto.UserCommentUpdateRequestDto;
import com.codebooth.springusercommentstaff.userCommentPackage.usercomment.UserComment;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserCommentMapper {

    UserCommentMapper INSTANCE_COMMENT = Mappers.getMapper(UserCommentMapper.class);

    UserCommentDto convertToUserCommentDto(UserComment userComment);

    List<UserCommentDto> convertToUserCommentDtoList(List<UserComment> userCommentList);

    UserComment convertToUserComment(UserCommentSaveRequestDto userCommentSaveRequestDto);

    UserComment convertToUserComment(UserCommentUpdateRequestDto userCommentUpdateRequestDto);

}
