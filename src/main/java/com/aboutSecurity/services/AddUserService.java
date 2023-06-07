package com.aboutSecurity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.aboutSecurity.entities.User;
import com.aboutSecurity.repositories.UserRepository;

@Service
public class AddUserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public Boolean addUser() {
		
		User user = new User();
		
		user.setName("Roary");
		user.setPassword(passwordEncoder.encode("1234"));
		user.setRole("USER");
		user.setEmail("roary2035@gmail.com");
		
		userRepo.save(user);
		
		return true;
		
	}
	
}
