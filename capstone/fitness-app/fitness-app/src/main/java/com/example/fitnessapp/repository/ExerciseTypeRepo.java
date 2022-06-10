package com.example.fitnessapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fitnessapp.entity.ExerciseType;

@Repository
public interface ExerciseTypeRepo extends JpaRepository<ExerciseType, Long> {

}
