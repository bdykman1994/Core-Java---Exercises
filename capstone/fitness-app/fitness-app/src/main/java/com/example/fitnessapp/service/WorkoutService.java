package com.example.fitnessapp.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.fitnessapp.entity.User;
import com.example.fitnessapp.entity.Workout;

public interface WorkoutService {

	 List<Workout> getWorkout();
	 public void addWorkout(Workout workout);

}
