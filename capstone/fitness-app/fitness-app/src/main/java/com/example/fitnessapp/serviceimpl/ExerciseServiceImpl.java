package com.example.fitnessapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.fitnessapp.entity.Exercise;
import com.example.fitnessapp.repository.ExerciseRepo;
import com.example.fitnessapp.service.ExerciseService;

@Service
public class ExerciseServiceImpl implements ExerciseService {

	@Autowired
	ExerciseRepo exerciseRepo;
	
	@Override
	public List<Exercise> getAllExercise() {
		return (List<Exercise>) exerciseRepo.findAll();
	}

	@Override
	@Transactional
	public void addExercise(Exercise exercise) {
		exerciseRepo.save(exercise);
	}

	@Override
	@Transactional
	public Optional<Exercise> getExerciseById(Long exerciseId) {
		return exerciseRepo.findById(exerciseId);
	}

}
