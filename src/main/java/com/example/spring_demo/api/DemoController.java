package com.example.spring_demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_demo.model.User;
import com.example.spring_demo.services.ClientService;

@RestController
public class DemoController
{
	
	
	private ClientService clientService;
	
	public DemoController(ClientService clientService )
	{
		this.clientService = clientService;
		
	}
	
	@GetMapping("/")
	String testFunc(){
		return "Yeeeeeeaaaahhh !!!  I'm Working !";
	}
	
	@GetMapping("/users")
	Iterable<User>users()
	{
		return clientService.findAll();
	}
	
	@GetMapping("/users/count")
	public Long count()
	{
		return clientService.count();
	}

}
