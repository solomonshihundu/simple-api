package com.example.spring_demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_demo.model.User;

@Service
public class ClientService
{
	
	@Autowired
	private ClientRepository clientRepository;
	
	public List<User>findAll(){
		
		Iterable<User> it = clientRepository.findAll();
		List<User>users = new ArrayList<User>();
		
		it.forEach(e -> users.add(e));
		
		return users;
		
	}
	
	public Long count()
	{
		return clientRepository.count();
	}

}
