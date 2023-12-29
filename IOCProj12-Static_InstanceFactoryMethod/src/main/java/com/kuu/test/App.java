package com.kuu.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class App 
{
    public static void main( String[] args )
    {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions("com/kuu/cfgs/applicationContext.xml");
        
        Class clazz = factory.getBean("cs" ,Class.class);
        
        System.out.println(clazz.getClass()+"::::"+clazz.toString());
        
    }
}
