package com.kuu.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.kuu.beans.WishMessageGenerator;

public class App3 
{
    public static void main( String[] args )
    {
        ClassPathResource res = new ClassPathResource("applicationContext.xml");
        XmlBeanFactory factory = new XmlBeanFactory(res);
        WishMessageGenerator generator = factory.getBean("wmg",WishMessageGenerator.class);
        String result =  generator.genrateMessage("Raja");
        System.out.println("Wish Message is : "+result);
    }
}
