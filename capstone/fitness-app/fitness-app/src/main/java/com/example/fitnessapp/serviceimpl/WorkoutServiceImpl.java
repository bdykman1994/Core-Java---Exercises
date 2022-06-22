package com.example.fitnessapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fitnessapp.entity.Workout;
import com.example.fitnessapp.repository.UserRepo;
import com.example.fitnessapp.repository.WorkoutRepo;
import com.example.fitnessapp.service.WorkoutService;

@Service
public class WorkoutServiceImpl implements WorkoutService {
	
	@Autowired
	WorkoutRepo workoutRepo;
	
	@Autowired
	UserRepo userRepo;


	@Override
	
	public void addWorkout(Workout workout) {
		workoutRepo.save(workout);
	}


	@Override
	public Optional<Workout> getWorkoutById(Long id) {
		return workoutRepo.findById(id);
	}


	@Override
	public void deleteWorkoutById(Long workoutId){
		 workoutRepo.deleteById(workoutId);
	}



	@Override
	public List<Workout> getAllWorkoutForUser(Long userId) {
		return workoutRepo.getWorkoutsForUser(userId);
	}



}
