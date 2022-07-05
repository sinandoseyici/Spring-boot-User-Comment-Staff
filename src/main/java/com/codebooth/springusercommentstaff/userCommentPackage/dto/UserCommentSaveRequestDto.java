package com.codebooth.springusercommentstaff.userCommentPackage.dto;

import com.codebooth.springusercommentstaff.userPackage.user.User;
import lombok.Data;

import java.util.Date;

@Data
public class UserCommentSaveRequestDto {

    private Long id;
    private String comment;
    private Date commentDate;
    private Long productId;
    private User user;

}
