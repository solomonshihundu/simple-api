package com.example.spring_demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.spring_demo.model.User;

@Repository("postgres_implementation")
public class DemoUserAccessService implements UserDao
{
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public DemoUserAccessService(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertUser(String id, User user) {
		jdbcTemplate.update("INSERT INTO  userdata (id,name) VALUES(?,?)",id,user.getName());
		return 1;
	}

	@Override
	public List<User> selectAllUsers() {
		//get everything form the table
		final String sqlQuery = "SELECT id,name FROM userdata";
		
		return jdbcTemplate.query(sqlQuery, (resultSet,i) -> {
			return new User(resultSet.getString("id")
					,resultSet.getString("name")
					);
		});
	}

	@Override
	public Optional<User> selectUserById(String id) {
		
		final String sqlQuery = "SELECT id,name FROM userdata WHERE id = ?";
		
		User user = jdbcTemplate.queryForObject(sqlQuery, new Object[] {id},
				(resultSet,i)->{
					return new User(resultSet.getString("id")
							,resultSet.getString("name"));
			});
		return Optional.ofNullable(user);
	}

	@Override
	public int deleteUserById(String id) {
		final String sqlQuery = "DELETE FROM userdata WHERE id = ?";
		jdbcTemplate.update(sqlQuery, id);
		return 1;
	}

	@Override
	public int updateUserById(String id, User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
