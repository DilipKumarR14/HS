package com.dilip.spring.AOP;

import java.util.Date;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

	//specific match
//	@Before("execution (public void com.dilip.spring.AOP.AccountDAO.add())")
	
	// any class having this method
//	@Before("execution (public void addAccount())")
	
	// use in any class any method in it with matching regex
//	@Before("execution (public void add*())")
	
	// removed the return (as it is optional) match method return type is void
//	@Before("execution (void add*())")
	
	// method with any return type matching the add*** pattern method name
//	@Before("execution (* add*())")
	
	// method Parameters
//	() - match the method with no arg
//	(*) - match the method with one arg of any type
//	(..) - match the method with 0 or more arg of any type
	
	
//	@Before("execution (* packagename.classname.methodname(..)")
	
	
	public void loggers() {
		
		System.out.println("---> LOGGER "+" "+new Date()+" : "+getClass());	
	}
	
}
