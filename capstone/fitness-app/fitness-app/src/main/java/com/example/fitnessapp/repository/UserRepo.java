	package com.example.fitnessapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fitnessapp.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
