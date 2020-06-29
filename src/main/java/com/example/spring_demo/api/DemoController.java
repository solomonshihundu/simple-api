package com.example.spring_demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_demo.model.User;
import com.example.spring_demo.services.ClientService;

@RequestMapping("api/v1/")
@RestController
public class DemoController
{
	
	@Autowired
	private ClientService clientService;
	
	@PostMapping
	public void addUser(@Validated @NonNull @RequestBody User user)
	{
	//	clientService.insertUser(user);
	}
	
	@GetMapping("/users")
	public List<User>getAllUsers()
	{
		return clientService.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable String id)
	{
		return clientService.getUserById(id).orElse(null);
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUserById(@PathVariable String id)
	{
		 clientService.deleteUser(id);
	}
	
	@GetMapping("/")
	String testFunc(){
		return "Yeeeeeeaaaahhh !!!  I'm Working !";
	}
	
	

}
