package com.example.fitnessapp.service;

import java.util.List;
import java.util.Optional;

import com.example.fitnessapp.entity.User;
import com.example.fitnessapp.repository.UserRepo;

public interface UserService {

	List<User> getUser();

	void addUser(User user);

	Optional<User> getUserById(Long userid);

//	public User updateWorkoutUserID(User user);



	
	
}
