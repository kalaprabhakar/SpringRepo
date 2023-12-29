package com.kuu.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.kuu.controller.MainController;
import com.kuu.dao.StudentDAOImpl;
import com.kuu.vo.StudentVO;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		try {
			DefaultListableBeanFactory factory  = new DefaultListableBeanFactory();
			XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
			reader.loadBeanDefinitions("com/kuu/cfgs/applicationContext.xml");
			
			MainController controller = factory.getBean("controller" ,MainController.class);
			
			br =new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter Student Name :");
			String name = br.readLine();
			System.out.println("Enter Course :");
			String course = br.readLine();
			System.out.println("Enter Student Address :");
			String address = br.readLine();
			System.out.println("Enter Mark1 ;");
			String mark1 = br.readLine();
			System.out.println("Enter Mark2 :");
			String mark2 = br.readLine();
			System.out.println("Enter Mark3 :");
			String mark3 = br.readLine();
			
			StudentVO vo = new StudentVO();
			vo.setName(name);
			vo.setCourse(course);
			vo.setAddress(address);
			vo.setMark1(mark1);
			vo.setMark2(mark2);
			vo.setMark3(mark3);
			
			String msg = controller.proceeStudent(vo);
			
			System.out.println(msg);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
