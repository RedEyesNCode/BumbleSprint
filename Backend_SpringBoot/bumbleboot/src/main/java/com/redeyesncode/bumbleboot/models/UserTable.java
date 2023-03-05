package com.redeyesncode.bumbleboot.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class UserTable {

    @Id
    @SequenceGenerator(name = "user_merce_sequence", sequenceName = "user_merce_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_merce_sequence")
    private Long id;

    @Column(columnDefinition="TEXT")
    private String password;

        private String first_name;

        private String last_name;

    private String email;

    private String userName;
    private String number;


    private boolean isVerified = false;


    private int gender_id;

    private String bio;

    private BigDecimal LAT_;

    private BigDecimal LONG_;


    private int interested_id;

    private String DATE_ME_ID="-1";





}
