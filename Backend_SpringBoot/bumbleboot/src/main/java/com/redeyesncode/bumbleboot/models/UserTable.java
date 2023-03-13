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
public class    UserTable {

    @Id
    @SequenceGenerator(name = "user_bumble_sequence", sequenceName = "user_bumble_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_bumble_sequence")
    private Long id;

    private String password;

        private String first_name;

        private String last_name;

    private String email;

    private String userName;
    private String number;


    private boolean isVerified;


    private int gender_id;

    private String bio;

        private String LAT_;

    private String LONG_;


    private int interested_id;

        private String DATE_ME_ID;

    public UserTable(String password, String first_name, String last_name, String email, String userName, String number, boolean isVerified, int gender_id, String bio, String LAT_, String LONG_, int interested_id, String DATE_ME_ID) {
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.userName = userName;
        this.number = number;
        this.isVerified = isVerified;
        this.gender_id = gender_id;
        this.bio = bio;
        this.LAT_ = LAT_;
        this.LONG_ = LONG_;
        this.interested_id = interested_id;
        this.DATE_ME_ID = DATE_ME_ID;
    }
}
