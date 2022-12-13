package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.graphql.demo"})
public class PersonasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonasApplication.class, args);
	}

}
