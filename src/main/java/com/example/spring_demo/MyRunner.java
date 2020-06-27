package com.example.spring_demo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.spring_demo.model.User;
import com.example.spring_demo.services.ClientRepository;

@Component
public class MyRunner implements CommandLineRunner {

  
    @Autowired
    private ClientRepository clientRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {    

        var u1 = new User("001","Mike Will Made It");
        clientRepository.save(u1);

        var u2 = new User("002", "Rample Stilkskin");
        clientRepository.save(u2);

        var u3 = new User("003", "Roberto Felipe Ricardo");
        clientRepository.save(u3);
    }
}
