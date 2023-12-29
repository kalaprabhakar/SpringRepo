package com.kuu.dao;

import com.kuu.bo.CustomerBO;

public interface ICustomerDAO {
	
	public int addCustomer(CustomerBO bo)throws Exception;

}
