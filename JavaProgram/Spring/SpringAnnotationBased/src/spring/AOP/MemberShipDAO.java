package com.dilip.spring.AOP;

import org.springframework.stereotype.Component;

@Component
public class MemberShipDAO {

	public boolean add1Account() {

		System.out.println(getClass()+"  Class");
		return true;

	}
	
	
}
