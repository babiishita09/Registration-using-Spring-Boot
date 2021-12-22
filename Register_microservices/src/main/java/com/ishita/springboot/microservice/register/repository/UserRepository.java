package com.ishita.springboot.microservice.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ishita.springboot.microservice.register.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
	
}
