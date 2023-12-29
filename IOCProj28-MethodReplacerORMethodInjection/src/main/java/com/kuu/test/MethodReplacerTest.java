package com.kuu.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kuu.service.BankService;

public class MethodReplacerTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/kuu/cfgs/applicationContext.xml");
		
		BankService  service = ctx.getBean("bankService",BankService.class);
		
		System.out.println(service.calInterestAmount(100000, 8, 5));

	}

}
