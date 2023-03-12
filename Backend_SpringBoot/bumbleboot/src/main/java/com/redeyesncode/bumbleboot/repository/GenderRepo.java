package com.redeyesncode.bumbleboot.repository;

import com.redeyesncode.bumbleboot.models.common.GenderTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepo extends JpaRepository<GenderTable,Long> {
}
