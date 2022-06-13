package com.example.fitnessapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.example.fitnessapp.CustomUserDetails;
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
	@Transactional
	public void addWorkout(Workout workout) {
		workoutRepo.save(workout);
	}

	@Override
	public List<Workout> getWorkout() {
			return workoutRepo.findAll();

	}

	@Override
	@Transactional
	public Optional<Workout> getWorkoutById(Long id) {
		return workoutRepo.findById(id);
	}



//	@Override
//	public Workout updateExerciseWorkoutID(Workout workout) {
//	List<Exercise> exr = workout.getExercise();
//	for (Exercise ex: exr) {
//		ex.setWorkout(workout);
//	}
//	
//		return null;
//	}

}
