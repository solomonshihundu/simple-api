package com.example.spring_demo.api;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_demo.model.User;
import com.example.spring_demo.services.ClientRepository;

@RestController
public class DemoController
{
	
	private ClientRepository clientRepository;
	
	public DemoController(ClientRepository clientRepository )
	{
		this.clientRepository = clientRepository;
		
	}
	
	@GetMapping("/")
	String testFunc(){
		return "Yeeeeeeaaaahhh !!!  I'm Working !";
	}
	
	@GetMapping("/users")
	Iterable<User>users()
	{
		return clientRepository.findAll();
	}
	
	@Bean
	ApplicationRunner applicationRunner(ClientRepository clientRepository)
	{
		
		return  args ->{
			clientRepository.save(new User("001","Rample"));
			clientRepository.save(new User("002","Stilkin"));
			
		};
	}

}
