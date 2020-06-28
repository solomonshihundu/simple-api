package com.example.spring_demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.spring_demo.model.User;
import com.example.spring_demo.services.ClientRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
	/*
	@Bean
	ApplicationRunner applicationRunner(ClientRepository clientRepo)
	{
		return args->{
			clientRepo.save(new User("001","Mike Will Made It"));
			clientRepo.save(new User("002", "Rample Stilkskin"));
		};
	}
	*/
	
}
