package com.example.spring_demo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.example.spring_demo.model.User;
import com.example.spring_demo.services.UserRepository;

@Component
public class RunnerApp implements CommandLineRunner
{

	@Autowired
	private UserRepository userRepo;

	
	@Override
	@Transactional
	public void run(String... args) throws Exception {
		User u1 = new User("003","Andrew Carnegi");
		User u2 = new User("004","Victor von Bistiek");
		
		userRepo.save(u1);
		userRepo.save(u2);
		
	}

}
