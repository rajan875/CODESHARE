package com.azure.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CodeshareApplication {

	@GetMapping("/app")
	public String app() {
		return "welocome to your azure application";
	}
	
	@GetMapping("/message")
	public String message() {
		return "deploying application to azure platform using azure app services and perform ci/cd pipline using github action";
	}
	public static void main(String[] args) {
		SpringApplication.run(CodeshareApplication.class, args);
	}

}
