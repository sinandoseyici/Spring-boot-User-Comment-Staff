package com.codebooth.springusercommentstaff.userCommentPackage.dto;

import com.codebooth.springusercommentstaff.userPackage.user.User;
import lombok.Data;

import java.util.Date;

@Data
public class UserCommentUpdateRequestDto {

// id değişmesin istiyoruz    private Long id;
    private String comment; // comment değişsin.
// tarih değişmesin istiyoruz    private Date commentDate;

    private User user;
}
