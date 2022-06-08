package com.example.fitnessapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.fitnessapp.entity.Exercise;
import com.example.fitnessapp.entity.ExerciseType;
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
	
	@PostMapping(path = "/addWorkout")
	public @ResponseBody String addWorkout(@RequestParam Workout workoutid,@RequestParam ExerciseType typeid, @RequestParam Long set, 
			@RequestParam Long rep, @RequestParam Integer distance,@RequestParam Integer time, @RequestParam Integer weight) {
		Exercise theExercise = new Exercise();
		theExercise.setExerciseType(typeid);
		theExercise.setReps(rep);
		theExercise.setDistance(distance);
		theExercise.setSets(set);
		theExercise.setTime(time);
		theExercise.setWeight(weight);
		theExercise.setWorkout(workoutService.updateExerciseWorkoutID(workoutid));
		exerciseService.addExercise(theExercise);
		return "heh";
	}
}
