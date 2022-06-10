package com.example.fitnessapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fitnessapp.entity.Exercise;

@Repository
public interface ExerciseRepo extends JpaRepository<Exercise, Long> {

}
