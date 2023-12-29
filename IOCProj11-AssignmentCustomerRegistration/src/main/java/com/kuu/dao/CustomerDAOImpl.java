package com.kuu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.kuu.bo.CustomerBO;

public final class CustomerDAOImpl implements ICustomerDAO {
	
	private DataSource ds;
	private Connection conn=null;
	private PreparedStatement ps = null;
	private static final String INSERT_SQL = "insert into layered_spring_customer (cname,cmobile,caddr,product1,product2,product3,total,discount,net_total) values(?,?,?,?,?,?,?,?,?)";
	
	

	public CustomerDAOImpl(DataSource ds) {
		super();
		this.ds = ds;
	}



	@Override
	public int addCustomer(CustomerBO bo) throws Exception {
		int rowCount;
		
	    try {
	    	
	    	conn=ds.getConnection();
	    	ps=conn.prepareStatement(INSERT_SQL);
	    	ps.setString(1, bo.getCname());
	    	ps.setString(2, bo.getCmobile());
	    	ps.setString(3, bo.getCaddr());
	    	ps.setInt(4, bo.getProduct1());
	    	ps.setInt(5, bo.getProduct2());
	    	ps.setInt(6, bo.getProduct3());
	    	ps.setInt(7, bo.getTotal());
	    	ps.setFloat(8, bo.getDiscount());
	    	ps.setFloat(9, bo.getNet_total());
	    	
	    	rowCount = ps.executeUpdate();
	    	
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		
		return rowCount;
	}

}
