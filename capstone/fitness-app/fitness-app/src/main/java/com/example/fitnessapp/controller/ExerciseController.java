package com.example.fitnessapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.fitnessapp.entity.Exercise;
import com.example.fitnessapp.entity.User;
import com.example.fitnessapp.entity.Workout;
import com.example.fitnessapp.repository.ExerciseRepo;
import com.example.fitnessapp.repository.WorkoutRepo;
import com.example.fitnessapp.service.ExerciseService;
import com.example.fitnessapp.service.WorkoutService;

@Controller
@RequestMapping(path = "/exercise")
public class ExerciseController {

	@Autowired
	WorkoutRepo workoutRepo;
	
	@Autowired
	ExerciseRepo exerciseRepo;
	
	@Autowired
	ExerciseService exerciseService;
	
	@Autowired
	WorkoutService workoutService;
	
	
	@GetMapping("")
	public String viewExerciseHome(Model theModel) {
		List<Exercise> theExercise = exerciseService.getAllExercise();
		theModel.addAttribute("workout", theExercise);
//		Long userid = ((CustomUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal().getUsersId();
//		System.out.println(userid);
//		workoutService.getWorkoutById(userid)
//		System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());
		return "exercisePage";
	}
	

}