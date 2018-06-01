package com.springbootexample.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan({"com.springbootexample.service","com.springbootexample.dao","com.springbootexample.controller","com.springbootexample.application","com.springbootexample.repository","com.springbootexample.model"})

@EnableJpaRepositories(basePackages="com.springbootexample.repository")
@EntityScan(basePackages="com.springbootexample.model")
public class EmployeeApplication {
	
	public static void main (String [] args)
	{
		SpringApplication.run(EmployeeApplication.class, args);
	}

}
