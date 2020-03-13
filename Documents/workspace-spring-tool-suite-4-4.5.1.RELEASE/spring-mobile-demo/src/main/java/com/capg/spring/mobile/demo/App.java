package com.capg.spring.mobile.demo;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
  {
    Mobile nokia;
    ApplicationContext context=
    		new ClassPathXmlApplicationContext("spring.xml");
    
    nokia=(Mobile)context.getBean("mobile");
    nokia.browseInternet();
    nokia.makeACall();
    
    }
}
