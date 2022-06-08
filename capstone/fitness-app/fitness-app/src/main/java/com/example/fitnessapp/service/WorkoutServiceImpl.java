package com.example.fitnessapp.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fitnessapp.entity.Exercise;
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
	@Transactional
	public void addWorkout(Workout workout) {
		workoutRepo.save(workout);
	}

	@Override
	@Transactional
	public List<Workout> getWorkout() {
			return workoutRepo.findAll();

	}

	@Override
	@Transactional
	public Optional<Workout> getWorkoutById(Long id) {
		return workoutRepo.findById(id);
	}

	@Override
	public Workout updateExerciseWorkoutID(Workout workout) {
	List<Exercise> exr = workout.getExercise();
	for (Exercise ex: exr) {
		ex.setWorkout(workout);
	}
	
		return null;
	}

}
