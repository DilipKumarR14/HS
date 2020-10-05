package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext cac = SpringApplication.run(FirstProjApplication.class, args);
		
		Alien al = cac.getBean(Alien.class);
		
		al.prints();
	}

}
