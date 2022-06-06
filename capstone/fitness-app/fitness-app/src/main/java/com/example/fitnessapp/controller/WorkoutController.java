package com.example.fitnessapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.fitnessapp.service.UserService;
import com.example.fitnessapp.service.WorkoutService;

@Controller
@RequestMapping(path = "/workout")
public class WorkoutController {

	@Autowired
	WorkoutService workoutService;
	
	@Autowired
	UserService userService;
	
	
//	@GetMapping(path = "/getworkout")
//	public @ResponseBody String addWorkout
	
}
