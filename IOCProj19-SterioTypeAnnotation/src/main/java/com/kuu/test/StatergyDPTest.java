package com.kuu.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kuu.comp.Flipkart;

public class StatergyDPTest {

	public static void main(String[] args) {
		
  
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("com/kuu/cfgs/applicationContext.xml");
		
		Flipkart  flipkart = factory.getBean("flkt", Flipkart.class);
		
	String result =	flipkart.shopping( new String [] {"pent" , "shirt" ,"trouser"}, new float [] {1000.0f,2000.0f,3000.0f});
		
	System.out.println(result);
	}

}
