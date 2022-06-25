package com.example.fitnessapp.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.fitnessapp.entity.Exercise;
import com.example.fitnessapp.entity.Workout;
import com.example.fitnessapp.service.ExerciseService;
import com.example.fitnessapp.service.WorkoutService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ExerciseServiceImplTest {

	@Autowired
	ExerciseService exerciseService;
	
	@Autowired
	WorkoutService workoutService;
	
	@Test
	void shouldSaveExercise() {
		Exercise exercise = new Exercise();
		Workout workout = workoutService.getWorkoutById((long) 1).get();
		exercise.setWorkoutId(workout);
		exercise.setExerciseType("Pull Ups");
		exercise.setReps((long)10);
		exercise.setSets((long)1);
		exercise.setWeight(100);
		exerciseService.addExercise(exercise);
		
		assertEquals("Pull Ups", exercise.getExerciseType());
		
	}

}
