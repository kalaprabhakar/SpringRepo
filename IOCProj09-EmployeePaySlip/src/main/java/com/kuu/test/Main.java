package com.kuu.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.kuu.contoller.MainController;
import com.kuu.dao.EmployeeDAOImpl;
import com.kuu.javabeans.EmployeeVO;

public class Main {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/kuu/cfgs/applicationContext.xml");
		
		MainController controller = factory.getBean("controller",MainController.class);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		 
		try {
			System.out.println("Enter Employee Number :");
			String eno = (br.readLine());
			System.out.println("Enter Employee Name :");
			String ename = br.readLine();
			System.out.println("Enter Employee Designation :");
			String designation = br.readLine();
			System.out.println("Enter Employee Basic Salary :");
			String basicSalary = (br.readLine());
			
			EmployeeVO vo = new EmployeeVO();
			vo.setEno(eno);
			vo.setEname(ename);
			vo.setDesignation(designation);
			vo.setBasicSalary(basicSalary);
			
			String msg = controller.processEmployee(vo);
			System.out.println(msg);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
