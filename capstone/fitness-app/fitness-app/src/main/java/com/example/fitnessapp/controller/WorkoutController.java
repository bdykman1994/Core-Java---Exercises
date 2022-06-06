package com.example.fitnessapp.controller;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.fitnessapp.entity.User;
import com.example.fitnessapp.entity.Workout;
import com.example.fitnessapp.service.UserService;
import com.example.fitnessapp.service.WorkoutService;

@Controller
@RequestMapping(path = "/workout")
public class WorkoutController {

	@Autowired
	WorkoutService workoutService;
	
	@Autowired
	UserService userService;
	
	@PostMapping(path = "/addworkout")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public @ResponseBody String addWorkout(@RequestParam User userid, @RequestParam Date date ){	
		Workout theworkout = new Workout();
		theworkout.setDate(date);
		theworkout.setUser(userService.updateWorkoutUserID(userid));
		workoutService.addWorkout(theworkout);
		return "gucci";
		
		
		
	}
}
