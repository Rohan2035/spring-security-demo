package com.aboutSecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aboutSecurity.services.AddUserService;

@RestController
public class HomeController {
	
	@Autowired
	private AddUserService addUserService;
	
	@GetMapping("/")
	public String WelcomePage() {
		
		return "<h1 align='center'>Welcome<h1>";
		
	}
	
	@GetMapping("/home")
	public String homePage() {
		
		return "<h1 align='center'>Hello user, I hope you're fine !!<h1>";
		
	}
	
	@GetMapping("/about")
	@PreAuthorize("hasAuthority('ADMIN')")
	public String AboutPage() {
		
		return "<h1 align='center'>Helllo this is about the page!!<h1>";
		
	}
	
	@GetMapping("/addUserDetails")
	public String addUser() {
		
		if(addUserService.addUser()) {
		
			return "<h1 align='center'>A user has been added Successfully !!</h1>";
			
		} else {
			
			return "<h1 align='center'>Oops !! Something went wrong</h1>";
			
		}
		
	}
	
}
