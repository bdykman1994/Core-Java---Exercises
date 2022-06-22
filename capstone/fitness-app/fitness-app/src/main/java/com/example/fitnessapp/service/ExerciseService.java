package com.example.fitnessapp.service;

import java.util.List;
import java.util.Optional;

import com.example.fitnessapp.entity.Exercise;

public interface ExerciseService {

	List<Exercise> getAllExercise();
	
	void addExercise(Exercise exercise);
	
	Optional<Exercise> getExerciseById(Long exerciseId);
	
	List<Exercise> getAllExercisesFromUser(Long exerciseId);
	
	void deleteExerciseById(Long exerciseId);
}
