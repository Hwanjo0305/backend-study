package com.backendstudy.day26;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication(scanBasePackages = "com.backendstudy")
@EntityScan(basePackages = "com.backendstudy.day37")
public class Day26Application {

	public static void main(String[] args) {
		SpringApplication.run(Day26Application.class, args);
	}

}
