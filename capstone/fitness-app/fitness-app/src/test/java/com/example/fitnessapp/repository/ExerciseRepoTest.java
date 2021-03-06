package com.example.fitnessapp.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.fitnessapp.entity.Exercise;

@ExtendWith(SpringExtension.class)
@SpringBootTest
//annotation that Spring supports for a JPA test that focuses only on JPA components.	
//@DataJpaTest
class ExerciseRepoTest {

	
	@Autowired
	private ExerciseRepo exerciserepo;
		

	
	@Test
	public void givenUserIdwillExerciesShowRelatedToUser() {
		Long userId = (long) 1;
		
		List<Exercise> exerciseList = exerciserepo.getAllExercisesFromUser(userId);
		
		assertEquals(1, exerciseList.size());

		}

		
	}
	

	