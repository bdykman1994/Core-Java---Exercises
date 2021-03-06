package com.example.fitnessapp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.fitnessapp.entity.Exercise;
import com.example.fitnessapp.entity.User;
import com.example.fitnessapp.entity.Workout;
import com.example.fitnessapp.service.ExerciseService;
import com.example.fitnessapp.service.UserService;
import com.example.fitnessapp.service.WorkoutService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping(path = "/workout")
public class WorkoutController {

	@Autowired
	WorkoutService workoutService;

	@Autowired
	UserService userService;

	@Autowired
	ExerciseService exerciseService;

	@GetMapping(value = { "", "/", "/list" })
	public ModelAndView workoutHomeAllWorkOuts(HttpSession session) {
		ModelAndView mav = new ModelAndView("workout_home_page");
		
		//SecurityContextHolder stores information about logged in user. We are then grabbing the email of the logged in user.
		//We then cast connver that email to a string so it can be used for a custom query.
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String useremail = ((UserDetails) principal).getUsername();
	
		
		//using authenticated User email for a custom query to grab the actual User object of the logged in user.
		// basically the convertion of classes would look like this ..
		//(Security context holder aka Logged in user) -> Grab email of logged in user -> Perform custom query with said email to grab the actual object of user
		User user = userService.findUserByEmail(useremail);
		
		//grabbing the user id of user to assign foreign keys to objects made by logged in user
		Long userId = user.getUserId();
		

		
		//saves username for later logs
		session.setAttribute("LoggedInUsersUsername", useremail);
		session.setAttribute("LoggedInUsersID", userId);
		

		List<Workout> workout = workoutService.getAllWorkoutForUser(userId);
		List<Exercise> exercise = exerciseService.getAllExercisesFromUser(userId);
		
		log.info(session.getAttribute("LoggedInUsersID") + " Has Gone to Home Page");
		
		mav.addObject("workout", workout);
		mav.addObject("exercise", exercise);
		
		
		
		return mav;
	}

	@GetMapping(value = "/addWorkoutForm")
	public ModelAndView addWorkoutForm(HttpSession session) {
		ModelAndView mav = new ModelAndView("add-workout-form");
		Workout newWorkout = new Workout();
		mav.addObject("workout", newWorkout);
		
//		log.info(session.getAttribute("LoggedInUsersUsername") + " has accessed workout form");
		
		return mav;
	}

	@PostMapping(value = "/saveWorkout")
	public ModelAndView saveWorkout(@ModelAttribute Workout workout, HttpSession session, RedirectAttributes redirectAttributes) {

		// to set the foreign key user_id to a newly created workout ( that way we know
		// who made the workout)
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = ((UserDetails) principal).getUsername();
		User user = userService.findUserByEmail(username);
		
		ModelAndView mav = new ModelAndView("redirect:/workout/list");
		
		String saved = "Workout has been saved";
		redirectAttributes.addFlashAttribute("SavedWorkout", saved);
		
		workout.setUserId(user);
		workoutService.addWorkout(workout);
		
		log.info(session.getAttribute("LoggedInUsersUsername") + " has saved a workout");

		
		return mav;
	}

	@GetMapping(value = "/showUpdateForm")
	public ModelAndView showUpdateForm(@RequestParam Long workoutId, HttpSession session) {
		ModelAndView mav = new ModelAndView("add-workout-form");
		Workout workout = workoutService.getWorkoutById(workoutId).get();
		mav.addObject("workout", workout);
		
//		log.info(session.getAttribute("LoggedInUsersUsername") + " has updated a workout");
		log.info(session.getAttribute("LoggedInUsersId") + " Has Gone to Home Page");
		
		return mav;
	}

	@GetMapping(value = "/deleteWorkout")
	public ModelAndView deleteWorkout(@RequestParam Long workoutId, HttpSession session, RedirectAttributes redirectAttributes) {
		ModelAndView mav = new ModelAndView("redirect:/workout/list");
		workoutService.deleteWorkoutById(workoutId);
		
		String delete = "Workout has been deleted";
		redirectAttributes.addFlashAttribute("deletedWorkout", delete);
		
		return mav;
	}

	@GetMapping(value = "AddExerciseForm")
	public ModelAndView addExerciseForm(@ModelAttribute Exercise exercise, @RequestParam Long workoutId, HttpSession session) {
		ModelAndView mav = new ModelAndView("add-exercise-form");
		Exercise newExercise = new Exercise();
		Workout workout = workoutService.getWorkoutById(workoutId).get();
		newExercise.setWorkoutId(workout);
		mav.addObject("exercise", newExercise);
		
//		log.info(session.getAttribute("LoggedInUsersUsername") + " has accessed an Exercise form");

		
		return mav;
	}

	@PostMapping(value = "/saveExercise")
	public String saveWorkout(@ModelAttribute Exercise exercise, HttpSession session, RedirectAttributes redirectAttributes ) {

		exerciseService.addExercise(exercise);
		String saved = "Exercise has been saved";
		redirectAttributes.addFlashAttribute("SavedExercise", saved);
		log.info(session.getAttribute("LoggedInUsersUsername") + " has added an exercise");

		
		return "redirect:/workout/list";

	}

	@GetMapping(value = "/showExerciseUpdateForm")
	public ModelAndView showExerciseUpdateForm(@RequestParam Long exerciseId, HttpSession session) {
		ModelAndView mav = new ModelAndView("add-exercise-form");
		Exercise exercise = exerciseService.getExerciseById(exerciseId).get();
		mav.addObject("exercise", exercise);
		
		log.info(session.getAttribute("LoggedInUsersUsername") + " has updated an exercise");

		
		return mav;
	}

	@GetMapping(value = "/deleteExercise")
	public ModelAndView deleteExerciseForm(@RequestParam Long exerciseId, HttpSession session, RedirectAttributes redirectAttributes) {
		ModelAndView mav = new ModelAndView("redirect:/workout/list");
		
		exerciseService.deleteExerciseById(exerciseId);
		String delete = "Exercise has been deleted";
		redirectAttributes.addFlashAttribute("deletedExercise", delete);
		log.info(session.getAttribute("LoggedInUsersUsername") + " has deleted an exercise");

		
		return mav;
	}

}
