package com.qa.controller;

import java.util.List;
import java.util.Optional;

import com.qa.entities.User;
import com.qa.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping ("/users")
	public List <User> getUsers() {
		return userRepository.findAll();
	}
	
	@GetMapping ("/users/{id}")
	public User getUser(@PathVariable Long id) {
		Optional <User> user= userRepository.findById(id);
		return user.get();
	}

	@DeleteMapping ("/users/{id}")
	public boolean deleteUser(@PathVariable Long id) {
		userRepository.deleteById(id);
		return true;
	}

	@PostMapping("/user")
	@ResponseBody
	public void createUser(User user) {
		 userRepository.save(user);
	}
	
//	}
//	@PutMapping("/user/")
//	public User updateUser(User user) {
//		return userRepository.save(user);
//	}
//	

	
}
