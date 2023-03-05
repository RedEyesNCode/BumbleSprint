package com.redeyesncode.bumblejwtboot.models.users;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
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
    @SequenceGenerator(name = "user_bumble_sequence", sequenceName = "user_bumble_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_bumble_sequence")
    private Long id;

    @Column(columnDefinition="TEXT")
    private String password;

    private String first_name;

    private String last_name;

    private String email;

    private boolean isVerified = false;

    private int gender_id;

    private String details;

    private String bio;


    private int interested_id;

    private BigDecimal Lat_;

    private BigDecimal Long_;

    private String DATE_ME_ID = "-1";










}
