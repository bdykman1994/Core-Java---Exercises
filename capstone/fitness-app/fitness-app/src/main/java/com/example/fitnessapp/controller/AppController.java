package com.example.fitnessapp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.fitnessapp.entity.User;
import com.example.fitnessapp.repository.UserRepo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class AppController {

	@Autowired
	private UserRepo userRepo;

	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}

	@GetMapping(value = "/workout_tips")
	public ModelAndView viewWorkoutTipsPage() {
		ModelAndView mav = new ModelAndView("workout_tips");
		return mav;
		
	}
	
	
	@GetMapping(value ="/register")
	public ModelAndView showRegistrationForm() {
		ModelAndView mav = new ModelAndView("signup_form");
		mav.addObject("user", new User());
		
		return mav;
	}

	@PostMapping(value = "/process_register")
	public String processRegister(User user) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);

		userRepo.save(user);

		return "register_success";
	}


	
	@GetMapping( value = "/users")
	public ModelAndView listUsers() {
		ModelAndView mav = new ModelAndView("users");
		List<User> listUsers = userRepo.findAll();
		mav.addObject("listUsers", listUsers);
		return mav;
	}
	
	@GetMapping(value = "/login")
	public ModelAndView loginpage() {
		ModelAndView mav = new ModelAndView("login_page");
		return mav;
	}

	@GetMapping(value = "/logout")
    public ModelAndView logout(HttpSession session, Authentication authentication, RedirectAttributes redirectAttributes) {
        ModelAndView mav = new ModelAndView("redirect:/");
		session.invalidate();
        authentication.isAuthenticated();
        String LoggedOut = "You have been logged out";
        redirectAttributes.addFlashAttribute("LoggedOut",LoggedOut);
        return mav;
    }
	
}
