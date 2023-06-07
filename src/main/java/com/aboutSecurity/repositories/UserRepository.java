package com.aboutSecurity.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aboutSecurity.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	public User findById(int id);
	public Optional<User> findByName(String name);

}
