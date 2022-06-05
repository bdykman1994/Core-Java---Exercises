package com.example.fitnessapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fitnessapp.entity.ExerciseType;

public interface ExerciseTypeRepo extends JpaRepository<ExerciseType, Long> {

}
