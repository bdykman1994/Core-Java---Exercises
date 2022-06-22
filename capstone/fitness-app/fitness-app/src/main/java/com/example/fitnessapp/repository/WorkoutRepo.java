package com.example.fitnessapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.fitnessapp.entity.Workout;

@Repository

public interface WorkoutRepo extends JpaRepository<Workout, Long> {

	@Query(value="SELECT workout_id, date, u.user_id FROM capstone_db.workout w\n"
			+ "join userinfo u on w.user_id = u.user_id\n"
			+ "where w.user_id = :userId", nativeQuery = true)
	public List<Workout> getWorkoutsForUser(Long userId);
	

	
}
