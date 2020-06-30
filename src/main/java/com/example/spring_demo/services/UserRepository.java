package com.example.spring_demo.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_demo.model.User;

@Repository
public interface UserRepository extends CrudRepository <User, String> {

}
