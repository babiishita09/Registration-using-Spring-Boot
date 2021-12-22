
package com.ishita.springboot.microservice.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ishita.springboot.microservice.register.entities.User;
import com.ishita.springboot.microservice.register.repository.UserRepository;

@Controller
public class HomeController {
	
	@Autowired
	private UserRepository repo;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/register")
	public String signupPage(Model model) {
		model.addAttribute("user", new User());
		return "signup";
	}
	
	@PostMapping("/register_process")
	public String signup(User user) {
		repo.save(user);
		return "register_successful";
	}
	
	

}
