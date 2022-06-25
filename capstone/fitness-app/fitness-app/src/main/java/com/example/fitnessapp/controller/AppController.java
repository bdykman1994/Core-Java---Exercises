package com.example.fitnessapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.fitnessapp.entity.User;
import com.example.fitnessapp.repository.UserRepo;

@Controller
public class AppController {

	@Autowired
	private UserRepo userRepo;

	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}

	@GetMapping(value = "/workout_tips")
	public ModelAndView viewWorkoutTipsPage() {
		ModelAndView mav = new ModelAndView("workout_tips");
		return mav;
		
	}
	
	
	@GetMapping(value ="/register")
	public ModelAndView showRegistrationForm() {
		ModelAndView mav = new ModelAndView("signup_form");
		mav.addObject("user", new User());
		
		return mav;
	}

	@PostMapping(value = "/process_register")
	public String processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);

		userRepo.save(user);

		return "register_success";
	}


	
	@GetMapping( value = "/users")
	public ModelAndView listUsers() {
		ModelAndView mav = new ModelAndView("users");
		List<User> listUsers = userRepo.findAll();
		mav.addObject("listUsers", listUsers);
		return mav;
	}
	
}
