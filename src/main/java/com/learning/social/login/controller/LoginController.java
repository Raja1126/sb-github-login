package com.learning.social.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/")
    public String unsecured(){
        return "Hello All";
    }

    @GetMapping("/secured")
    public String secured(){
        return "Hello Secured";
    }
}
