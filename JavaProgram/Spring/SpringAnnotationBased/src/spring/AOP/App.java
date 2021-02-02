package com.dilip.spring.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
    	
        AccountDAO accountDAO = ac.getBean("accountDAO", AccountDAO.class);
        
        accountDAO.addAccount();


        MemberShipDAO memberShipDAO = ac.getBean("memberShipDAO", MemberShipDAO.class);
        
        memberShipDAO.add1Account();
        
        
        ac.close();
        
    }
}
