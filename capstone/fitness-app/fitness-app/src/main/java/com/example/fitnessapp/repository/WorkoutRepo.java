package com.example.fitnessapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fitnessapp.entity.Workout;

public interface WorkoutRepo extends JpaRepository<Workout, Long> {

}
