package com.example.fitnessapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fitnessapp.entity.Exercise;

public interface ExerciseRepo extends JpaRepository<Exercise, Long> {

}