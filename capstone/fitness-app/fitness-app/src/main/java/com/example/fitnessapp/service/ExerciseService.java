package com.example.fitnessapp.service;

import java.util.List;
import java.util.Optional;

import com.example.fitnessapp.entity.Exercise;

public interface ExerciseService {

	List<Exercise> getExercise();
	
	void addExercise(Exercise exercise);
	
	Optional<Exercise> getExerciseById(Long exerciseId);
}
