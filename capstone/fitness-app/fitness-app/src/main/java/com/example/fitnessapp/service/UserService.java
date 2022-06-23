package com.example.fitnessapp.service;

import java.util.List;
import java.util.Optional;

import com.example.fitnessapp.entity.User;

public interface UserService {

	List<User> getUser();

	void addUser(User user);

	Optional<User> getUserById(Long userid);

	public User findUserByEmail(String username);

	public User converUserHeight(Integer height);

	
	
}
