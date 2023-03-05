package com.redeyesncode.bumbleboot.repository;

import com.redeyesncode.bumbleboot.models.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserTable,Long> {


}
