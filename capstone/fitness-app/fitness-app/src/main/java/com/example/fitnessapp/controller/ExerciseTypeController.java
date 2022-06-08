package com.example.fitnessapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.fitnessapp.entity.ExerciseType;
import com.example.fitnessapp.service.ExerciseTypeService;

@Controller
@RequestMapping(path = "/exercisetype")
public class ExerciseTypeController {

	@Autowired
	ExerciseTypeService exerciseTypeService;
	
	@PostMapping(path = "addtype")
	public @ResponseBody void addExerciseType(String name){
		ExerciseType et = new ExerciseType();
		et.setExerciseTypeName(name);
		exerciseTypeService.addExerciseType(et);
	}
}
