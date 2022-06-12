package com.example.fitnessapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.fitnessapp.entity.User;
import com.example.fitnessapp.service.UserService;

@Controller
@RequestMapping(path = "/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/listusers")
	public String listUser(Model theModel) {

		List<User> theUser = userService.getUser();
		theModel.addAttribute("users", theUser);
		return "test";
	}
	@PostMapping(path = "/findbyid")
	public @ResponseBody Optional<User> getUserbyId(@RequestParam Long id) {
		return userService.getUserById(id);

	}

	@PostMapping(path = "/addusers")
	public @ResponseBody String addUser(@RequestParam String username, @RequestParam String fname,
			@RequestParam String lname, @RequestParam Integer height, @RequestParam Integer weight,
			@RequestParam Integer age) {
		User newUser = new User();
		newUser.setUsername(username);
		newUser.setFirstName(fname);
		newUser.setLastName(lname);
		newUser.setHeight(height);
		newUser.setWeight(weight);
		newUser.setAge(age);
		userService.addUser(newUser);
		return "user saved";
	}

}
