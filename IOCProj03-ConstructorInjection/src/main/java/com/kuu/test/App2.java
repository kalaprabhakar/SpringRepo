package com.kuu.test;

import javax.sql.rowset.spi.XmlReader;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.kuu.beans.WishMessageGenerator;

public class App2 
{
    public static void main( String[] args )
    {
        //ClassPathResource resource = new ClassPathResource("applicationContext.xml");
        
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("applicationContext.xml");
        
        WishMessageGenerator generator = factory.getBean("wmg",WishMessageGenerator.class);
        String result = generator.genrateMessage("Raja");
        System.out.println(result);
        
    }
}
