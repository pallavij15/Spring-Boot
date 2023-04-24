package com.learnings.springboot.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.learnings.springboot.jpa.*")
@Configuration
@ComponentScan(basePackages = "com.learnings.springboot.jpa.repository*")
//@ComponentScan(basePackageClasses = "com.learnings.springboot.jpa.controller.EmpController")
@EnableJpaRepositories(basePackages = "com.learnings.springboot.jpa.repository.*")
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
		System.out.println("Hello Chetan!");
	}

}
