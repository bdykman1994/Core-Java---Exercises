package com.example.fitnessapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.fitnessapp.entity.User;
import com.example.fitnessapp.service.UserService;

@Controller
@RequestMapping(path = "/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/listusers")
	public @ResponseBody List<User> listUser(Model theModel) {

		List<User> theUser = userService.getUser();
		theModel.addAttribute("users", theUser);
		return theUser;
	}


}
