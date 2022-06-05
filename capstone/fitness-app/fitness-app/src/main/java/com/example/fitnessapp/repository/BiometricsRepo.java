package com.example.fitnessapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fitnessapp.entity.BiometricsEntity;

public interface BiometricsRepo extends JpaRepository<BiometricsEntity, Long> {

}
