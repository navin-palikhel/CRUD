package com.navin.crud.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String login(){

        return "signIn";
    }
}
