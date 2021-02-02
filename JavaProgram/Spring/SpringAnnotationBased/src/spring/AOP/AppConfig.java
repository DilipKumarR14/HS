package com.dilip.spring.AOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.dilip.spring.AOP")
@EnableAspectJAutoProxy
public class AppConfig {

	
	
}