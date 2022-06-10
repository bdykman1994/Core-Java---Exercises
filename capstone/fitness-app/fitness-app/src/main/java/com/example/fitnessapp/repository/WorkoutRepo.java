package com.example.fitnessapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fitnessapp.entity.Workout;

@Repository

public interface WorkoutRepo extends JpaRepository<Workout, Long> {

}
