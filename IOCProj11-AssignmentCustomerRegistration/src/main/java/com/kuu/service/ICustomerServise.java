package com.kuu.service;

import com.kuu.dto.CustomerDTO;

public interface ICustomerServise {
	
	public String calculateDiscount(CustomerDTO dto)throws Exception;

}
