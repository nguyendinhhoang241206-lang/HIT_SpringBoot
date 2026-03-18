package com.example.project01;

import com.example.project01.service.OderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Project01Application {

	public static void main(String[] args) {
		SpringApplication.run(Project01Application.class, args);
	}

	@Bean
	// interface có sẵn của Spring có method run
	CommandLineRunner run(OderService orderService) {
		return args -> {
			orderService.processOrder("Hoang", "Laptop", 22000000);
		};
	}
}
