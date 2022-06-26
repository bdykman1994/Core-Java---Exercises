package com.example.fitnessapp.serviceimpl;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.fitnessapp.entity.User;
import com.example.fitnessapp.service.UserService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class UserServiceImplTest {

	@Autowired
	UserService userService;
	
	@Test
	void shouldAddUser() {
		User user = new User();
		user.setAge(17);
		user.setEmail("user@gmail.com");
		user.setFirstName("Brandon");
		user.setLastName("Smith");
		user.setWeight(100);
		user.setUsername("bsmith");
		user.setPassword("123456");
		
		userService.addUser(user);
		
		assertEquals("Smith", user.getLastName());
	}

}
