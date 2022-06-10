package com.example.fitnessapp.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping(path = "/listworkout")
	public @ResponseBody List<Workout> getWorkout(Model theModel){
		
		List<Workout> theWorkout = workoutService.getWorkout();
		theModel.addAttribute("allworkout", theWorkout);
		return workoutService.getWorkout();
	}
	
	@PostMapping(path = "/findworkout")
	public @ResponseBody Optional<Workout> getWorkoutById( Long id) {
		Optional<Workout> thework =  workoutService.getWorkoutById(id);
		return thework;
	}


}
