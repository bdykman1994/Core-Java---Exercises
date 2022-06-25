package com.example.fitnessapp.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.fitnessapp.entity.Workout;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class WorkoutRepoTest {

	@Autowired
	WorkoutRepo workoutRepo;
	
	@Test
	void WillWorkoutsForUsersPopulate() {
		Long userId = (long) 1;
		
		List<Workout> listWorkouts = workoutRepo.getWorkoutsForUser(userId);
		
		Optional<Workout> workout = workoutRepo.findById(userId);
		
		assertThat(listWorkouts.contains(workout));
		
	}

}
