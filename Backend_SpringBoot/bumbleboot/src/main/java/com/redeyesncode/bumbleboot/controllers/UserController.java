package com.redeyesncode.bumbleboot.controllers;


import com.redeyesncode.bumbleboot.models.UserTable;
import com.redeyesncode.bumbleboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/date-me/user")
public class UserController {


    @Autowired
    private UserService userService;



    @PostMapping("/register")
    private ResponseEntity<?> registerUser(@RequestBody UserTable userTable){

        return userService.registerUser(userTable);

    }

    @PostMapping("/login-auth")
    private ResponseEntity<?> LoginUser(@RequestBody HashMap<String,String> hashMap){


        return userService.loginUser(hashMap);

    }


}
