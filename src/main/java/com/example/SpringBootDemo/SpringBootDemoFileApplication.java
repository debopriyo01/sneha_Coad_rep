package com.example.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.SpringBootDemo.Entity.Employee;

@SpringBootApplication
public class SpringBootDemoFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoFileApplication.class, args);
		System.out.println("Application running ..........");
		
		
	}
	
	
	

}
