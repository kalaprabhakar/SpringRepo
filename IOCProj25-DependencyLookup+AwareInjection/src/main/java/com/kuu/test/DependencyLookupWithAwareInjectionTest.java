package com.kuu.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kuu.comp.Cricket;

public class DependencyLookupWithAwareInjectionTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cx =new ClassPathXmlApplicationContext("com/kuu/cfgs/applicationContext.xml");
		Cricket ct = cx.getBean("ct",Cricket.class);
		
		ct.balling();
		ct.bating();
		ct.bating();
		ct.feilding();
		ct.wicketKepping();

	}

}
