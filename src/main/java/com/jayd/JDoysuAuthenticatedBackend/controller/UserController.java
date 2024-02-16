package com.jayd.JDoysuAuthenticatedBackend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

    @GetMapping("/")
    public String helloUser(){
        return "Hello User";
    }

}//class
