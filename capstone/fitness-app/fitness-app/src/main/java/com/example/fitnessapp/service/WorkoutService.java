package com.example.fitnessapp.service;

import java.util.List;

import com.example.fitnessapp.entity.User;
import com.example.fitnessapp.entity.Workout;

public interface WorkoutService {

	 List<Workout> getWorkout();
	 void addWorkout(User userid , Workout workout); 
}
