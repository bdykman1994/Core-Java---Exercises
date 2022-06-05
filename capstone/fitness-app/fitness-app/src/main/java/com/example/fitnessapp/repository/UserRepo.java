package com.example.fitnessapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fitnessapp.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Long> {

}
