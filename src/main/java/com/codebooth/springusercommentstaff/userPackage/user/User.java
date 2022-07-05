package com.codebooth.springusercommentstaff.userPackage.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "USER")
@Getter
@Setter
public class User implements Serializable {

    @Id
    @GeneratedValue(generator = "User")
    @SequenceGenerator(name = "User" , sequenceName = "USER_ID_SEQ", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME", length = 50)
    private String name;

    @Column(name = "SURNAME", length = 50)
    private String surname;

    @Email
    @Column(name = "EMAIL", length = 50)
    private String email;

    @Column(name = "PHONE_NUMBER", length = 15)
    private String phoneNumber;

    @Column(name = "BIRTH_DATE")
    @Temporal(TemporalType.DATE)
    private Date birthdate;

    @Transient
    // Db'de görünsün istemiyorum.
    private Boolean isActive;

}
