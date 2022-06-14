package com.example.fitnessapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import com.example.fitnessapp.entity.Workout;

public interface WorkoutService {

	public List<Workout> getAllWorkout();

	public void addWorkout(Workout workout);

	public Optional<Workout> getWorkoutById(Long id);
	
	public void deleteWorkout(Long id);
	
	

	
//	public List<Workout> findByUserId();
//	public Workout updateExerciseWorkoutID(Workout workout);
}
