package com.dilip.annotationbased.SpringAnnotationBased;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.dilip.annotationbased.SpringAnnotationBased")
public class AppConfig {

//	@Bean
//	public Samsung getPhone() {		
//		return new Samsung();
//	}
//	@Bean
//	public MobileProcessor getProcessor() {
//		return new SnapDragon();
//	}
}