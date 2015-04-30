package com.agilent.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.agilent")
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {		
		SpringApplication.run(Application.class, args);
	}
}
