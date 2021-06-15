package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WsCrudPractice1Application {

	public static void main(String[] args) {
		System.out.println("Welcome");
		SpringApplication.run(WsCrudPractice1Application.class, args);
		System.out.println("Welcome Again");
	}
}
