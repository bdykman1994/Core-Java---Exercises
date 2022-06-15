package com.example.fitnessapp.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.servlet.ModelAndView;

import com.example.fitnessapp.CustomUserDetails;
import com.example.fitnessapp.entity.Exercise;
import com.example.fitnessapp.entity.User;
import com.example.fitnessapp.entity.Workout;
import com.example.fitnessapp.repository.ExerciseRepo;
import com.example.fitnessapp.repository.WorkoutRepo;
import com.example.fitnessapp.service.ExerciseService;
import com.example.fitnessapp.service.UserService;
import com.example.fitnessapp.service.WorkoutService;

@Controller
@RequestMapping(path = "/workout")
public class WorkoutController {

	@Autowired
	WorkoutService workoutService;

	@Autowired
	WorkoutRepo workoutRepo;

	@Autowired
	UserService userService;

	@Autowired
	ExerciseService exerciseService;
	
	@Autowired
	ExerciseRepo exerciseRepo;

//	@PostMapping(path = "/addworkout")
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	public @ResponseBody String addWorkout(@RequestParam User userid, @RequestParam Date date ){	
//		Workout theworkout = new Workout();
//		theworkout.setDate(date);
//		theworkout.setUser(userService.updateWorkoutUserID(userid));
//		workoutService.addWorkout(theworkout);
//		return "gucci";
//		}
//	
	@GetMapping({"", "/", "/list"})
	public String workoutHomeAllWorkOuts(Model model) {
		List<Workout> workout = workoutService.getAllWorkout();
		List<Exercise> exercise = exerciseService.getAllExercise();

		model.addAttribute("workout", workout);
		model.addAttribute("exercise", exercise);

		return "workout_home_page";
	}

	@GetMapping("/registerworkout")
	public String workoutAddForm(Model model, User userid) {
		Workout workout = new Workout();

		model.addAttribute("workout", workout);
		return "workout_form";
	}

	@PostMapping("/process_workout")
	public String processWorkout(Workout workout) {

		workoutRepo.save(workout);

		return "success";
	}

	@GetMapping("/registerexercise")
	public String exerciseAddForm(Model model) {
		Exercise exercise = new Exercise();

		model.addAttribute("exercise", exercise);

		return "exercise_form";
	}
	
	@PostMapping("/process_exercise")
	public String processExercise(Exercise exercise) {
		
		exerciseRepo.save(exercise);
		
		return "success";
	}
	@GetMapping("/addWorkoutForm")
	public ModelAndView addWorkoutForm() {
		ModelAndView mav  = new ModelAndView("add-workout-form");
		Workout newWorkout = new Workout();
		mav.addObject("workout",newWorkout);
		return mav;
	}
	
	@PostMapping("/saveWorkout")
	public String saveWorkout(@ModelAttribute Workout workout) {
		workoutRepo.save(workout);
		System.out.println(workout.getDate());
		return"redirect:/workout/list";
	}
	
	@GetMapping("/showUpdateForm")
	public ModelAndView showUpdateForm(@RequestParam Long workoutId) {
		ModelAndView mav = new ModelAndView("add-workout-form");
		Workout workout = workoutRepo.findById(workoutId).get();
		mav.addObject("workout",workout);
		return mav;
	}
	
	
//	@GetMapping(path = "/listworkout")
//	public @ResponseBody List<Workout> getWorkout(Model theModel){
//			
//		List<Workout> theWorkout = workoutService.getAllWorkout();
//		theModel.addAttribute("allworkout", theWorkout);
//		return workoutService.getAllWorkout();
//	}
//	
//	@PostMapping(path = "/findworkout")
//	public @ResponseBody Optional<Workout> getWorkoutById( Long id) {
//		Optional<Workout> thework =  workoutService.getWorkoutById(id);
//		return thework;
//	}

}
