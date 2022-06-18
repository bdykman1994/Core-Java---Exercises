package com.example.fitnessapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
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
import com.example.fitnessapp.repository.UserRepo;
import com.example.fitnessapp.repository.WorkoutRepo;
import com.example.fitnessapp.service.ExerciseService;
import com.example.fitnessapp.service.UserService;
import com.example.fitnessapp.service.WorkoutService;

@Controller
@RequestMapping(path = "/workout")
public class WorkoutController {

	
	
	@Autowired
	UserRepo userRepo;
	
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

	

	@GetMapping({"", "/", "/list"})
	public String workoutHomeAllWorkOuts(Model model) {
		
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username  =  ((UserDetails)principal).getUsername();
		User user = userRepo.findByEmail(username);
		Long userId = user.getUserId();
		
		List<Workout> workout = workoutRepo.getWorkoutsForUser(userId);
		List<Exercise> exercise = exerciseRepo.getAllExercisesFromUser(userId);
//		List<Exercise> exercise = exerciseService.getAllExercise();
		

		model.addAttribute("workout", workout);
		model.addAttribute("exercise", exercise);
		
		Authentication auth2 = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(auth2);

		return "workout_home_page";
	}


	
	
	@GetMapping(value = "/addWorkoutForm")
	public ModelAndView addWorkoutForm() {
		ModelAndView mav  = new ModelAndView("add-workout-form");
		Workout newWorkout = new Workout();
		mav.addObject("workout",newWorkout);
		return mav;
	}
	
	@PostMapping(value = "/saveWorkout")
	public String saveWorkout(@ModelAttribute Workout workout) {
		
		//to set the foreign key user_id to a newly created workout ( that way we know who made the workout)
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username  =  ((UserDetails)principal).getUsername();
		User user = userRepo.findByEmail(username);
		workout.setUserId(user);
		
		workoutRepo.save(workout);
		return"redirect:/workout/list";
	}
	
	@GetMapping(value = "/showUpdateForm")
	public ModelAndView showUpdateForm(@RequestParam Long workoutId) {
		ModelAndView mav = new ModelAndView("add-workout-form");
		Workout workout = workoutRepo.findById(workoutId).get();
		mav.addObject("workout",workout);
		return mav;
	}
	
	@GetMapping(value = "/deleteWorkout")
	public String deleteWorkout(@RequestParam Long workoutId) {
//		//shows confirmation on redirect
//		redirectAttributes.addFlashAttribute()
		workoutRepo.deleteById(workoutId);
				
		return "redirect:/workout/list";
	}
	
	@GetMapping( value = "AddExerciseForm")
	public ModelAndView addExerciseForm(@ModelAttribute Exercise exercise, @RequestParam Long workoutId){
		ModelAndView mav = new ModelAndView("add-exercise-form");
		Exercise newExercise = new Exercise();
		Workout workout = workoutRepo.findById(workoutId).get();
		newExercise.setWorkoutId(workout);
		mav.addObject("exercise", newExercise);
		return mav;		
	}
	
	@PostMapping(value = "/saveExercise")
	public String saveWorkout(@ModelAttribute Exercise exercise ) {

		exerciseRepo.save(exercise);
		return"redirect:/workout/list";
	
}
	
	@GetMapping(value = "/showExerciseUpdateForm")
	public ModelAndView showExerciseUpdateForm(@RequestParam Long exerciseId) {
		ModelAndView mav = new ModelAndView("add-exercise-form");
		Exercise exercise = exerciseRepo.findById(exerciseId).get();
		mav.addObject("exercise",exercise);
		return mav;
	}
	
	@GetMapping(value = "/deleteExercise")
	public String deleteExerciseForm(@RequestParam Long exerciseId) {
//		//shows confirmation on redirect
//		redirectAttributes.addFlashAttribute()
//		exerciseRepo.deleteById(exerciseId);
		exerciseRepo.deleteById(exerciseId);
		
		
		return "redirect:/workout/list";
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
