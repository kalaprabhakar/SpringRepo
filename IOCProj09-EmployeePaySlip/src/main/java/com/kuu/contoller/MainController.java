package com.kuu.contoller;

import com.kuu.javabeans.EmployeeDTO;
import com.kuu.javabeans.EmployeeVO;
import com.kuu.service.IEmployeeMgntService;

public class MainController {
	
	private IEmployeeMgntService service;

	public MainController(IEmployeeMgntService service) {
		super();
		this.service = service;
	}
	
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
