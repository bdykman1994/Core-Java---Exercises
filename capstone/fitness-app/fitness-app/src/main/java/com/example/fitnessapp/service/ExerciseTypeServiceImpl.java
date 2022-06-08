package com.example.fitnessapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fitnessapp.entity.ExerciseType;
import com.example.fitnessapp.repository.ExerciseTypeRepo;

@Service
public class ExerciseTypeServiceImpl implements ExerciseTypeService {

	@Autowired
	ExerciseTypeRepo exerciseTypeRepo;
	
	@Override
	public void addExerciseType(ExerciseType exerciseType) {
		exerciseTypeRepo.save(exerciseType);
	}

}
