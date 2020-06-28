package com.example.spring_demo.api;

import java.util.List;

import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping
	public void addUser(@Validated @NonNull @RequestBody User user)
	{
		clientService.insertUser(user);
	}
	
	@GetMapping("/users")
	public List<User>getAllUsers()
	{
		return clientService.getAllUsers();
	}
	
	@GetMapping(path = "{id}")
	public User getUserById(@PathVariable("id")String id)
	{
		return clientService.getUserById(id).orElse(null);
	}
	
	@DeleteMapping
	public void deleteUserById(@PathVariable("id") String id)
	{
		 clientService.deleteUser(id);
	}
	
	@GetMapping("/")
	String testFunc(){
		return "Yeeeeeeaaaahhh !!!  I'm Working !";
	}
	
	

}
