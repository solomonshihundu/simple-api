package com.example.spring_demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.spring_demo.dao.UserDao;
import com.example.spring_demo.model.User;

@Service
public class ClientService 
{
	/*

	private final UserDao userDao;

	@Autowired
	public ClientService(@Qualifier("postgres_implementation") UserDao userDao) {
		this.userDao = userDao;
	}
	
	public int insertUser(User user)
	{
		return userDao.insertUser(user);
	}
	
	public List<User> getAllUsers()
	{
		return userDao.selectAllUsers();
	}
	
	public Optional<User> getUserById(String id)
	{
		return userDao.selectUserById(id);
	}
	
	public int deleteUser(String id)
	{
		return userDao.deleteUserById(id);
	}
	
	public int updateHouse(String id,User userUpdate)
	{
		return userDao.updateUserById(id, userUpdate);
	}
	 */

	@Autowired
	private UserRepository clientRepository;
	
	public List<User>findAll(){
		
		Iterable<User> it = clientRepository.findAll();
		List<User>users = new ArrayList<User>();
		
		it.forEach(e -> users.add(e));
		
		return users;
		
	}

	public Optional<User> getUserById(String id)
	{
		return clientRepository.findById(id);
	}

	public int deleteUser(String id)
	{
		 clientRepository.deleteById(id);
		 return 1;
	}


}
