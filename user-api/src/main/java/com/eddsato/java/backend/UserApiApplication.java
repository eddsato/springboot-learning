package com.eddsato.java.backend;

import com.eddsato.java.backend.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApiApplication {

	public static void main(String[] args) {

		/*
			Configura uma aplicação Spring básica e cria todos os beans
		*/
		SpringApplication.run(UserApiApplication.class, args);
	}
}
