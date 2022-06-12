package com.example.fitnessapp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fitnessapp.entity.ExerciseType;
import com.example.fitnessapp.repository.ExerciseTypeRepo;
import com.example.fitnessapp.service.ExerciseTypeService;

@Service
public class ExerciseTypeServiceImpl implements ExerciseTypeService {

	@Autowired
	ExerciseTypeRepo exerciseTypeRepo;
	
	@Override
	public void addExerciseType(ExerciseType exerciseType) {
		exerciseTypeRepo.save(exerciseType);
	}

}
