package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication()
public class SingerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingerApplication.class, args);
		System.out.println("succes");
	}

}
