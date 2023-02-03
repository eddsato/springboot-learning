package com.eddsato.java.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductApiApplication {

	public static void main(String[] args) {

		/*
			Configura uma aplicação Spring básica e cria todos os beans
		*/
		SpringApplication.run(ProductApiApplication.class, args);
	}
}
