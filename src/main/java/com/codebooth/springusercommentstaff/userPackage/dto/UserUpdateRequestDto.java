package com.codebooth.springusercommentstaff.userPackage.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserUpdateRequestDto implements Serializable {
    // update için bunlar yeterli.
    private Long id;
    private String surname;
    private String email;
    private String phoneNumber;
}
