package com.example.fitnessapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fitnessapp.entity.WorkoutEntity;

public interface WorkoutRepo extends JpaRepository<WorkoutEntity, Long> {

}
