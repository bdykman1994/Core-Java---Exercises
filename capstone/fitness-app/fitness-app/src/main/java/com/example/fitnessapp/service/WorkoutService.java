package com.example.fitnessapp.service;

import java.util.List;
import java.util.Optional;

import com.example.fitnessapp.entity.Workout;

public interface WorkoutService {

	List<Workout> getWorkout();

	public void addWorkout(Workout workout);

	Optional<Workout> getWorkoutById(Long id);

	public Workout updateExerciseWorkoutID(Workout workout);
}
