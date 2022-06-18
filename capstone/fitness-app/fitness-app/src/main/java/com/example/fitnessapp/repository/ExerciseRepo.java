package com.example.fitnessapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.fitnessapp.entity.Exercise;

@Repository
public interface ExerciseRepo extends JpaRepository<Exercise, Long> {

	@Query(value = "SELECT e.workout_id,  e.exercise_id, exercise_type, e.reps, e.sets, e.time, e.weight, w.date FROM capstone_db.userinfo ui\n"
			+ " join workout w on w.user_id = ui.user_id\n"
			+ " join exercise e on e.workout_id = w.workout_id\n"
			+ "where ui.user_id = :userId", nativeQuery = true)
	public List<Exercise> getAllExercisesFromUser(Long userId);
}
