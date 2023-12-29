package com.kuu.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.kuu.controller.MainController;
import com.kuu.dto.CustomerDTO;
import com.kuu.vo.CustomerVO;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
			XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
			reader.loadBeanDefinitions("com/kuu/cfgs/applicationContext.xml");
			
			MainController controller = factory.getBean("controller",MainController.class);
			
			System.out.println("Enter Customer Name :");
			String cname = br.readLine();
			System.out.println("Enter Customer Mobile No :");
			String cmobile = br.readLine();
			System.out.println("Enter Customer Address :");
			String caddr = br.readLine();
			System.out.println("Enter Price Of Product1 :");
			String product1 = br.readLine();
			System.out.println("Enter Price Of Product2 :");
			String product2 = br.readLine();
			System.out.println("Enter Price Of Product3 :");
			String product3 = br.readLine();
			
			CustomerVO vo = new CustomerVO();
			vo.setCname(cname);
			vo.setCmobile(cmobile);
			vo.setCaddr(caddr);
			vo.setProduct1(product1);
			vo.setProduct2(product2);
			vo.setProduct3(product3);
			
			String msg = controller.processCustomer(vo);
			
			System.out.println(msg);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
