package com.kuu.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.kuu.beans.WishMessageGenerator;

public class App 
{
    public static void main( String[] args )
    {
        FileSystemResource res = new FileSystemResource("src/main/java/com/kuu/cfgs/applicationContext.xml");
        
        XmlBeanFactory factory = new XmlBeanFactory(res);
        
        Object obj = factory.getBean("wmg");
        WishMessageGenerator generator = (WishMessageGenerator)obj;
        String result =  generator.genrateMessage("Raja");
        System.out.println("Wish Message is : "+result);
    }
}
