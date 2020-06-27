package com.example.spring_demo.services;

import org.springframework.data.repository.CrudRepository;

import com.example.spring_demo.model.User;

public interface ClientRepository extends CrudRepository<User, String> {}
