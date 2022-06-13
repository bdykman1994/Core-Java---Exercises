package com.example.fitnessapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.fitnessapp.CustomUserDetails;
import com.example.fitnessapp.entity.Exercise;
import com.example.fitnessapp.entity.User;
import com.example.fitnessapp.entity.Workout;
import com.example.fitnessapp.service.ExerciseService;
import com.example.fitnessapp.service.WorkoutService;

@Controller
@RequestMapping(path = "/exercise")
public class ExerciseController {


	
	@Autowired
	ExerciseService exerciseService;
	
	@Autowired
	WorkoutService workoutService;
	
	
	@GetMapping("")
	public String viewExerciseHome(Model theModel) {
		List<Exercise> theExercise = exerciseService.getExercise();
		theModel.addAttribute("workout", theExercise);
		Long userid = (Long) ((CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsersId();
		System.out.println(userid);
		System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());
		return "exercisePage";
	}
	
//	@PostMapping(path = "/addexercise")
//	public String addWorkout( Workout workoutid, ExerciseType typeid, Long set, 
//			 Long rep,  Integer distance, Integer time, Integer weight) {
//		Exercise theExercise = new Exercise();
//		theExercise.setExerciseType(typeid);
//		theExercise.setReps(rep);
//		theExercise.setDistance(distance);
//		theExercise.setSets(set);
//		theExercise.setTime(time);
//		theExercise.setWeight(weight);
//		theExercise.setWorkout(workoutid);
//		exerciseService.addExercise(theExercise);
//		return "heh";
//	}
	
	//not perminent used to test in postman
	@GetMapping(path = "/getexercise")
	public @ResponseBody List<Exercise> getWorkout(Model theModel){
		
		List<Workout> theExercise = workoutService.getWorkout();
		theModel.addAttribute("workout", theExercise);
		return exerciseService.getExercise();
	}
}
