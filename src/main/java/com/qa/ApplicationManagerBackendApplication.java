package com.qa;

import com.qa.entities.User;
import com.qa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApplicationManagerBackendApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationManagerBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("one","one", "1234"));
		userRepository.save(new User("two","two", "1235"));
	
	
	}
}
