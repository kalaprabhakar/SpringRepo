package com.kuu.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kuu.javabeans.EmployeeDTO;
import com.kuu.javabeans.EmployeeVO;
import com.kuu.service.IEmployeeMgntService;
@Controller("controller")
public class MainController {
	@Autowired
	private IEmployeeMgntService service;


	
	public String processEmployee(EmployeeVO vo )throws Exception{
		
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEno(Integer.parseInt(vo.getEno()));
		dto.setEname(vo.getEname());
		dto.setDesignation(vo.getDesignation());
		dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
		
		String result = service.registerEmployee(dto);
		
		  
		
		return result;
	}

}
