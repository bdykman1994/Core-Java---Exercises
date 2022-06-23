package com.example.fitnessapp.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.fitnessapp.entity.Exercise;

import lombok.Builder;


@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)


@DataJpaTest
class ExerciseRepoTest {

	
	@Autowired
	private ExerciseRepo exerciserepo;
	
	private Exercise exercise;
	
	@BeforeEach
	public void setup() {
		exercise = Exercise.builder()
				.exerciseType("PushUps")
				.reps((long) 1)
				.sets((long) 1)
				.build();
	}

	@Test
	public void givenEmployeeObject_whenSave_thenReturnSaveEmployee() {
		
		Exercise exercise = Exercise.builder()
				.exerciseType("PushUps")
				.reps((long) 1)
				.sets((long) 1)
				.build();
		
		Exercise savedExercise = exerciserepo.save(exercise);
		
	}
}
