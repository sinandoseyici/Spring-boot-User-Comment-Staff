package com.codebooth.springusercommentstaff.userPackage.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserSaveRequestDto implements Serializable {

    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private Date birthdate;

}
