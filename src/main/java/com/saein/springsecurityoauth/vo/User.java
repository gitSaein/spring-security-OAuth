package com.saein.springsecurityoauth.vo;

import java.time.LocalDateTime;

import org.apache.catalina.security.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;

import com.saein.springsecurityoauth.service.UserService;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

	@Autowired
	UserService service;
	
	String id;
	String username;
	LocalDateTime createOn;
	String createdBy;
	
	public void postPersist() {
	
		this.createOn = LocalDateTime.now();
		this.createdBy = service.currentUser();
	}
}
