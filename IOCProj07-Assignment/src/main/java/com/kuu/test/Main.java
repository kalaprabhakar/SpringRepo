package com.kuu.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.kuu.comp.Engine;
import com.kuu.comp.Vehicle;

public class Main {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/kuuu/cfgs/applicationContext.xml");
		
		Vehicle vehicle = factory.getBean("vl",Vehicle.class);
		System.out.println(vehicle);
		
		Engine engine = factory.getBean("cng",Engine.class);
		System.out.println(engine);
		
		String result = vehicle.festures(new String [] {"body","paint","assesory"}, new float [] {10000.0f,20000.0f,30000.0f});
		
		System.out.println(result);
	}

}
