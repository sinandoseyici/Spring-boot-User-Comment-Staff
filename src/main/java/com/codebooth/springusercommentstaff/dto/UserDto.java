package com.codebooth.springusercommentstaff.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserDto {

    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private Date birthdate;

}
