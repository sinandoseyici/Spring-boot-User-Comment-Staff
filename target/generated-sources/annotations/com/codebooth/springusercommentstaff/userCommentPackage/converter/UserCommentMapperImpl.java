package com.codebooth.springusercommentstaff.userCommentPackage.converter;

import com.codebooth.springusercommentstaff.userCommentPackage.dto.UserCommentDto;
import com.codebooth.springusercommentstaff.userCommentPackage.dto.UserCommentSaveRequestDto;
import com.codebooth.springusercommentstaff.userCommentPackage.dto.UserCommentUpdateRequestDto;
import com.codebooth.springusercommentstaff.userCommentPackage.usercomment.UserComment;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-06T00:13:48+0300",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 17.0.3.1 (Oracle Corporation)"
)
public class UserCommentMapperImpl implements UserCommentMapper {

    @Override
    public UserCommentDto convertToUserCommentDto(UserComment userComment) {
        if ( userComment == null ) {
            return null;
        }

        UserCommentDto userCommentDto = new UserCommentDto();

        userCommentDto.setId( userComment.getId() );
        userCommentDto.setComment( userComment.getComment() );
        userCommentDto.setCommentDate( userComment.getCommentDate() );
        userCommentDto.setProductId( userComment.getProductId() );
        userCommentDto.setUser( userComment.getUser() );

        return userCommentDto;
    }

    @Override
    public List<UserCommentDto> convertToUserCommentDtoList(List<UserComment> userCommentList) {
        if ( userCommentList == null ) {
            return null;
        }

        List<UserCommentDto> list = new ArrayList<UserCommentDto>( userCommentList.size() );
        for ( UserComment userComment : userCommentList ) {
            list.add( convertToUserCommentDto( userComment ) );
        }

        return list;
    }

    @Override
    public UserComment convertToUserComment(UserCommentSaveRequestDto userCommentSaveRequestDto) {
        if ( userCommentSaveRequestDto == null ) {
            return null;
        }

        UserComment userComment = new UserComment();

        userComment.setId( userCommentSaveRequestDto.getId() );
        userComment.setComment( userCommentSaveRequestDto.getComment() );
        userComment.setCommentDate( userCommentSaveRequestDto.getCommentDate() );
        userComment.setProductId( userCommentSaveRequestDto.getProductId() );
        userComment.setUser( userCommentSaveRequestDto.getUser() );

        return userComment;
    }

    @Override
    public UserComment convertToUserComment(UserCommentUpdateRequestDto userCommentUpdateRequestDto) {
        if ( userCommentUpdateRequestDto == null ) {
            return null;
        }

        UserComment userComment = new UserComment();

        userComment.setComment( userCommentUpdateRequestDto.getComment() );
        userComment.setUser( userCommentUpdateRequestDto.getUser() );

        return userComment;
    }
}
