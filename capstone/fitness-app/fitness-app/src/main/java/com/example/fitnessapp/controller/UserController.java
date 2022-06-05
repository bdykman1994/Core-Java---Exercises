package com.example.fitnessapp.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping(path = "/")
	public String sayHello(){
		return "Hello world" + LocalDateTime.now();
	}

}
