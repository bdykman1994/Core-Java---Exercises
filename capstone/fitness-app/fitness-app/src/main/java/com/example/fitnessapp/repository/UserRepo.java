	package com.example.fitnessapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.fitnessapp.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

	
	@Query("SELECT u FROM User u WHERE u.email = ?1")
	public User findByEmail(String email);

	
//	User findByUsername(String username);
	
}
