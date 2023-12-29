package com.kuu.comp;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("vote")
@PropertySource("com/kuu/comm/info.properties")
public class VotingVerification {
	
	@Value("${per.name}")
	private String name;
	@Value("${per.addr}")
	private String addr;
	@Value("${per.age}")
	private int age;
	private Date verifyon;
	
	
    @PostConstruct	
	public void myinit() {
		System.out.println("Employee.myinit()");
		
		verifyon = new Date();
		
		if(addr == null) {
			System.out.println("Address Not Provided....");
			
		}else if(name==null) {
			throw new IllegalArgumentException("Name Not Found ......");
		}else if(age <= 0 && age > 120  ) {
			throw new IllegalArgumentException("Age is not Valid ......");
		}
	}
	@PreDestroy
	public void myDestroy() {
		
		System.out.println("Employee.myDestroy()");
		name= null;
		addr = null;
		age = 0;
		verifyon = null;
	}
	
	public String msg() {
		if(age>18) {
			return "Mr/Mrs/Miss "+name+" You Are Elligible For Voting Your Age is "+age+" varified On "+verifyon;
		}else {
			return "Mr/Mrs/Miss "+name+" You Are Not Elligible For Voting Your Age is "+age+" varified On "+verifyon;
		}
	}
	
	
}
