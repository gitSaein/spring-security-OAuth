package com.saein.springsecurityoauth.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@FieldDefaults(level=AccessLevel.PRIVATE)
public class UserVo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String userEmail;
    String password;


}
