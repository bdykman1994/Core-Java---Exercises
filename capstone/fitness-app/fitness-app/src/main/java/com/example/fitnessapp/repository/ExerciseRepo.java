package com.example.fitnessapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fitnessapp.entity.ExerciseEntity;

public interface ExerciseRepo extends JpaRepository<ExerciseEntity, Long> {

}
