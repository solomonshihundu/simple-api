package com.example.spring_demo;

import com.example.spring_demo.services.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;

import com.example.spring_demo.model.User;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(UserRepository userRepository)
	{
		return args -> {
		userRepository.save(new User("003","Andrew Carnegi"));
			userRepository.save(new User("004","Victor von Bistiek"));
		};
	}

}



