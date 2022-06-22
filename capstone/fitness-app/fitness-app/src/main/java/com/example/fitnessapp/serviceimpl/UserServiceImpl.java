package com.example.fitnessapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.fitnessapp.entity.User;
import com.example.fitnessapp.repository.UserRepo;
import com.example.fitnessapp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public List<User> getUser() {
		return userRepo.findAll();
	}

	@Override
	public void addUser(User user) {
		userRepo.save(user);
	}

	@Override
	public Optional<User> getUserById(Long id) {
		return userRepo.findById(id);

	}

	@Override
	public User findUserByEmail(String username) {
		return userRepo.findByEmail(username);
	}

//	@Override
//	public User updateWorkoutUserID(User user) {
//		List<Workout> wrk = user.getWorkout();
//		for (Workout wk : wrk) {
//			wk.setUser(user);
//		}
//		return user;
//	}

}
