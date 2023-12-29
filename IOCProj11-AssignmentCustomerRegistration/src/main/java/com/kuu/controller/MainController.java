package com.kuu.controller;

import com.kuu.bo.CustomerBO;
import com.kuu.dto.CustomerDTO;
import com.kuu.service.ICustomerServise;
import com.kuu.vo.CustomerVO;

public class MainController {
	
	private ICustomerServise servise;

	public MainController(ICustomerServise servise) {
		super();
		this.servise = servise;
	}
	
	
	public String processCustomer(CustomerVO vo)throws Exception{
		
		String result;
		try {
		CustomerDTO dto = new CustomerDTO();
	
		dto.setCname(vo.getCname());
		dto.setCmobile(vo.getCmobile());
		dto.setCaddr(vo.getCaddr());
		dto.setProduct1(Integer.parseInt(vo.getProduct1()));
		dto.setProduct2(Integer.parseInt(vo.getProduct2()));
		dto.setProduct3(Integer.parseInt(vo.getProduct3()));
		
		result = servise.calculateDiscount(dto);
		
		
		}catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		
		return result;
	}

}
