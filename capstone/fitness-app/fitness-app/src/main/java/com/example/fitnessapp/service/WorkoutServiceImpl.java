package com.example.fitnessapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fitnessapp.entity.User;
import com.example.fitnessapp.entity.Workout;
import com.example.fitnessapp.repository.UserRepo;
import com.example.fitnessapp.repository.WorkoutRepo;

@Service
public class WorkoutServiceImpl implements WorkoutService {
	
	@Autowired
	WorkoutRepo workoutRepo;
	
	@Autowired
	UserRepo userRepo;

	@Override
	public List<Workout> getWorkout() {
		return workoutRepo.findAll();
	}

	@Override
	public void addWorkout(User userid, Workout workout) {
		workoutRepo.save( new Workout());
	}

}
