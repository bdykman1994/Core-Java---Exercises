package com.example.fitnessapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.fitnessapp.entity.Workout;

@Repository

public interface WorkoutRepo extends JpaRepository<Workout, Long> {

//	@Query( value = "FROM workout WHERE user_id = ?1")
//	public List<Workout> findByUserId(Long userid);
}
