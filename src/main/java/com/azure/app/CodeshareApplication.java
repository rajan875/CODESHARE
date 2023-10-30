package com.azure.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CodeshareApplication {

	@GetMapping("/app")
	public String message() {
		return "welocome to your azure app";
	}
	public static void main(String[] args) {
		SpringApplication.run(CodeshareApplication.class, args);
	}

}
