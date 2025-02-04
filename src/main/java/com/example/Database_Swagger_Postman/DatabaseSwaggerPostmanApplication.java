package com.example.Database_Swagger_Postman;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class DatabaseSwaggerPostmanApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseSwaggerPostmanApplication.class, args);
	}

}
