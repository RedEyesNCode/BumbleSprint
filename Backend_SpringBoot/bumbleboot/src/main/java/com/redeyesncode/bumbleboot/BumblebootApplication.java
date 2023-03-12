package com.redeyesncode.bumbleboot;

import com.redeyesncode.bumbleboot.models.UserTable;
import com.redeyesncode.bumbleboot.models.common.GenderTable;
import com.redeyesncode.bumbleboot.repository.GenderRepo;
import com.redeyesncode.bumbleboot.repository.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class BumblebootApplication {

	public static void main(String[] args) {
		SpringApplication.run(BumblebootApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(UserRepo userRepo, GenderRepo genderRepo) {
		return args -> {
			userRepo.save(new UserTable("password","ashutosh","singh","email@address.com","RedEyesNCode","6261319133",false,1,"Bio", BigDecimal.valueOf(2.34),BigDecimal.valueOf(2.34),2,"-1"));
			userRepo.flush();
			genderRepo.save(new GenderTable("Male"));
			genderRepo.save(new GenderTable("Female"));
				genderRepo.save(new GenderTable("Secret."));
				genderRepo.flush();

		};
	}
}
