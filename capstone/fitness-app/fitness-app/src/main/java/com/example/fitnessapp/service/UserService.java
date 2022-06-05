package com.example.fitnessapp.service;

import java.util.List;

import com.example.fitnessapp.entity.User;

public interface UserService {


	
	public List<User> getUser();
	void addUser(User user);
}
