package com.example.fitnessapp.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.fitnessapp.entity.Workout;
import com.example.fitnessapp.service.WorkoutService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class WorkoutServiceImplTest {

	@Autowired
	WorkoutService workoutService;
	
	@Test
	void shouldSaveWorkout() {
		Workout workout = new Workout();
		Date date = new Date();
		
		workout.setDate(date);
		workout.setWorkoutName("Leg Day");
		
		workoutService.addWorkout(workout);
		
		assertEquals("Leg Day", workout.getWorkoutName());
			 
		
	}

}
