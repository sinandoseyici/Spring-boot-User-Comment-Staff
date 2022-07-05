package com.codebooth.springusercommentstaff.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserUpdateRequestDto implements Serializable {
    // update için bunlar yeterli.
    private String surname;
    private String email;
    private String phone;
}
