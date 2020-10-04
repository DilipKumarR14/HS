package com.dilip.SpringTut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext context  = new ClassPathXmlApplicationContext("com/dilip/SpringTut/spring.xml");

		Car v = (Car) context.getBean("car");
		v.drive();
		
	}
}
