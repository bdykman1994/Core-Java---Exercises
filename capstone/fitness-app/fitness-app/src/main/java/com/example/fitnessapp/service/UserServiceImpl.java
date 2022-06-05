package com.example.fitnessapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.fitnessapp.entity.User;
import com.example.fitnessapp.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	

	@Override
	@Transactional
	public  List<User> getUser() {
		return userRepo.findAll();
	}


	@Override
	@Transactional
	public void addUser(User user) {
		userRepo.save(user);
	}




}
