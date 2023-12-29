package com.kuu.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.kuu.beans.WishMessageGenerator;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext facttory = new ClassPathXmlApplicationContext("com/kuu/cfgs/applicationContext.xml");
    	WishMessageGenerator generator = facttory.getBean("wmg",WishMessageGenerator.class);
    	
        String result =  generator.genrateMessage("Raja");
        System.out.println("Wish Message is : "+result);
    }
}
