package com.redeyesncode.bumbleboot.service;


import com.redeyesncode.bumbleboot.models.UserTable;
import com.redeyesncode.bumbleboot.models.common.CustomStatusCodeModel;
import com.redeyesncode.bumbleboot.models.common.StatusCodeModel;
import com.redeyesncode.bumbleboot.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;


    public ResponseEntity<?> registerUser(UserTable userTable) {
        boolean isRegistered = false;
//        List<UserTable> users = userRepo.findAll();
//        for (int i = 0; i < users.size(); i++) {
//            if(Objects.equals(users.get(i).getNumber(),userTable.getNumber())){
//                isRegistered = true;
//                break;
//            }
//        }
        userRepo.save(userTable);

        return ResponseEntity.ok(new StatusCodeModel("success",200,"User Registered Sucessfully ! "));


    }

    public ResponseEntity<?> loginUser(HashMap<String, String> hashMap) {

        return ResponseEntity.ok(new StatusCodeModel("success",200,"Login Success"));
    }

    public ResponseEntity<?> getAllUser() {

        return ResponseEntity.ok(new CustomStatusCodeModel("success",200,userRepo.findAll()));

    }
}
