package com.redeyesncode.bumblejwtboot.controllers;


import com.redeyesncode.bumblejwtboot.models.common.StatusCodeModel;
import com.redeyesncode.bumblejwtboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/date-me/")
public class DateController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public ResponseEntity<?> getTest(){

        return ResponseEntity.ok(new StatusCodeModel("success",200,"Tested AUTH JWT !"));
    }



}
