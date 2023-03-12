package com.redeyesncode.bumbleboot.models.common;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class GenderTable {


    @Id
    @SequenceGenerator(name = "gender_male_sequence", sequenceName = "gender_male_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gender_male_sequence")
    private Long id;

    public GenderTable(String genderName) {
        this.genderName = genderName;
    }

    private String genderName;


}
