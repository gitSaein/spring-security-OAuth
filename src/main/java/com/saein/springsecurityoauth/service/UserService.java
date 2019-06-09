package com.saein.springsecurityoauth.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.saein.springsecurityoauth.vo.User;

@Service
public class UserService {

	public String currentUser() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		User user = (User)auth.getPrincipal();
		return user.getUsername();
	}
}
