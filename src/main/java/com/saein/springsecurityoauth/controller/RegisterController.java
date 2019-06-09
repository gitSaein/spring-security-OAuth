package com.saein.springsecurityoauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @PostMapping("/user/register")
    public String userRegister() {
    	return "";
    }
    
    @GetMapping("/test")
    public String test() {
    	return"test";
    }
}
