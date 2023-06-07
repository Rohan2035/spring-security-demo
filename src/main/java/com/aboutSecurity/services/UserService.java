package com.aboutSecurity.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.aboutSecurity.entities.User;
import com.aboutSecurity.repositories.UserRepository;
import com.aboutSecurity.security.UserInfoDetails;

@Component
public class UserService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<User> userInfo = userRepository.findByName(username);
		
		return userInfo.map(UserInfoDetails::new).orElseThrow(() -> new UsernameNotFoundException("User not found"));
		
	}

}
