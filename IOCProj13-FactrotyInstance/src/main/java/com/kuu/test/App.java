package com.kuu.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.kuu.beans.Printer;
import com.kuu.beans.WishMessageGenerator;

public class App 
{
    public static void main( String[] args )
    {
    	DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
    	reader.loadBeanDefinitions("com/kuu/cfgs/applicationContext.xml");
    	
    	WishMessageGenerator generator = factory.getBean("wmg",WishMessageGenerator.class);
    	WishMessageGenerator generator1 = factory.getBean("wmg",WishMessageGenerator.class);
    	
    	System.out.println(generator.hashCode()+":::"+generator1.hashCode());
    	System.out.println(generator==generator1);
    	System.out.println("==================================");
    	WishMessageGenerator generator2 = factory.getBean("wmg1",WishMessageGenerator.class);
    	WishMessageGenerator generator3 = factory.getBean("wmg1",WishMessageGenerator.class);
    	
    	
    	System.out.println("======================================");
    	
    	Printer p = factory.getBean("ps",Printer.class);
    	Printer p1 = factory.getBean("ps",Printer.class);
    	System.out.println(p.hashCode()+"::::"+p1.hashCode());
    	System.out.println(p==p1);
    	
    	System.out.println("=============================");
    	Printer p2 = factory.getBean("ps1",Printer.class);
    	Printer p3 = factory.getBean("ps1",Printer.class);
    	System.out.println(p2.hashCode()+"::::"+p3.hashCode());
    	System.out.println(p2==p3);
    	
    	
    	
    	
    	System.out.println(generator2.hashCode()+":::"+generator3.hashCode());
    	System.out.println(generator2==generator3);
    	System.out.println("===============================");
    	Printer printer =factory.getBean("p1",Printer.class);
    	Printer printer1 =factory.getBean("p1",Printer.class);
    	
    	System.out.println(printer.hashCode()+"::::"+printer1.hashCode());
    	System.out.println(printer==printer1);
    	System.out.println("===============================");
    	Printer printer2 =factory.getBean("p2",Printer.class);
    	Printer printer3 =factory.getBean("p2",Printer.class);
    	
    	System.out.println(printer2.hashCode()+"::::"+printer3.hashCode());
    	System.out.println(printer2==printer3);
    
    	
    }
}
