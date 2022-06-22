package com.example.fitnessapp.service;

import java.util.List;
import java.util.Optional;

import com.example.fitnessapp.entity.Workout;

public interface WorkoutService {


	public void addWorkout(Workout workout);

	public Optional<Workout> getWorkoutById(Long id);
	
	public void deleteWorkoutById(Long workoutId);

	List<Workout> getAllWorkoutForUser(Long userId);
	
	

	
//	public List<Workout> findByUserId();
//	public Workout updateExerciseWorkoutID(Workout workout);
}
