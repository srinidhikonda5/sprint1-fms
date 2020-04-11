package com.capg1.mobile.demo2;

import java.lang.annotation.Retention;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.capg1.mobile.demo2")
@PropertySource("app.properties")
public class MobileConfigurations {
	


@Bean(name="Scanner")
public Scanner getScanner() {
	Scanner in =new Scanner(System.in);
	System.out.println("enter the name");
	String str=in.next();
	System.out.println("name is : "+str);
	System.out.println("Scanner bean created");
	return in;
	
}}

//	@Bean(name = "vodafone")
//	public VodafoneSim getVodafoneSim() {
//		VodafoneSim vf=new VodafoneSim();
//		vf.setCallCharges(1.75f);
//		vf.setInternetSpeed(6.8f);
//		Map<String, Long> contacts=new HashMap<>();
//		contacts.put("Rahul", 751548412L);
//		contacts.put("Krishna",841649812L);
//		vf.setContacts(contacts);
//		return vf;
//	}
//	
//	 @Bean(name="mobile")
//	 public Mobile getMobile() {
//		 Mobile m= new Mobile();
//		 m.setSim(getVodafoneSim());
//		 return m;
//	 }
//	 
//}


