package com.kuu.service;

import com.kuu.bo.CustomerBO;
import com.kuu.dao.ICustomerDAO;
import com.kuu.dto.CustomerDTO;

public final class CustomerServiceImpl implements ICustomerServise {
	
	private ICustomerDAO dao;
	
	

	public CustomerServiceImpl(ICustomerDAO dao) {
		super();
		this.dao = dao;
	}



	@Override
	public String calculateDiscount(CustomerDTO dto) throws Exception {
		
		int total = dto.getProduct1()+dto.getProduct2()+dto.getProduct3();
		float discount = total * .15f;
		float net = total-discount;
		
		CustomerBO bo = new CustomerBO();
		bo.setCname(dto.getCname());
		bo.setCmobile(dto.getCmobile());
		bo.setCaddr(dto.getCaddr());
		bo.setProduct1(dto.getProduct1());
		bo.setProduct2(dto.getProduct2());
		bo.setProduct3(dto.getProduct3());
		bo.setTotal(total);
		bo.setDiscount(discount);
		bo.setNet_total(net);
		
		int i = dao.addCustomer(bo);
		
		if(i==1) {
			return "Customer Added Successfully....";
		}else {
			return "Fsiled , Customer Not Addes....";
		}
		
		
		
	}

}
