package com.example.spring_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@RestController
	class DemoController
	{
		@GetMapping("/")
		String testFunc(){
			return "Yeeeeeeaaaahhh !!!  I'm Working !";
		}
	}
	

}
