package com.kuu.service;

import com.kuu.dao.IEmployeeDAO;
import com.kuu.javabeans.EmployeeBO;
import com.kuu.javabeans.EmployeeDTO;

public final class EmployeeMngmServiceImpl implements IEmployeeMgntService {

	private IEmployeeDAO dao;

	public EmployeeMngmServiceImpl(IEmployeeDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public String registerEmployee(EmployeeDTO dto) throws Exception {
		
		
		
		float grossSalary =   (dto.getBasicSalary() + (.4f * dto.getBasicSalary()));
		
		float netSalary =  (grossSalary - (.4f*dto.getBasicSalary()));
		
		EmployeeBO bo = new EmployeeBO();
		bo.setEno(dto.getEno());
		bo.setEname(dto.getEname());
		bo.setDesignation(dto.getDesignation());
		bo.setBasic_salary(dto.getBasicSalary());
		bo.setGross_salary(grossSalary);
		bo.setNet_salary(netSalary);
		
		int count = dao.insertEmployee(bo);
		
		if(count==1) {
		  return	"Employee Registered  Successfully......";
		}else {
			return "Employee Register Failure.......";
		}
		
	}

}
