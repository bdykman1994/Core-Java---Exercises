package com.example.fitnessapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fitnessapp.entity.ExerciseTypeEntity;

public interface ExerciseTypeRepo extends JpaRepository<ExerciseTypeEntity, Long> {

}
