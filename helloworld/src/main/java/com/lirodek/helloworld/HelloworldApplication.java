package com.lirodek.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@SpringBootApplication
public class HelloworldApplication {

	
	
	@GetMapping("/")
	public String index(){
		return "<h1>Hello World with Spring Boot</h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}

}
