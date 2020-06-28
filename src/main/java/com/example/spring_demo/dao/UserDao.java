package com.example.spring_demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.spring_demo.model.User;

public interface UserDao
{
    int insertUser(String id,User user);
	
	default int insertUser(User user)
	{
		String id="000";
		return insertUser(id,user);
				
	}
	
	List<User> selectAllUsers();
	
	Optional<User>selectUserById(String id);
	
	int deleteUserById(String id);
	
	int updateUserById(String id,User user);

}
