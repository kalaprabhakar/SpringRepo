package com.kuu.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kuu.comp.VotingVerification;

public class CheckEligible {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/kuu/cfgs/applicationContext.xml");
		VotingVerification verification = context.getBean("vote",VotingVerification.class);
		
		System.out.println(verification.msg());
		
		context.close();
	}

}
