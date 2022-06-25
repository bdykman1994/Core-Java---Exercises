package com.example.fitnessapp.repository;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.fitnessapp.entity.User;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class UserRepoTest {

	@Autowired
	UserRepo userRepo;
	
	@Test
	void WillUserBeFoundByEmail() {
		String email = "bdykman1994@gmail.com";
		
		User user = userRepo.findByEmail(email);
		assertThat(user.getFirstName().contentEquals("Brandon"));
	}

}
