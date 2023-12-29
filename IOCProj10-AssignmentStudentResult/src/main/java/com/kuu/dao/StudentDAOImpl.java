package com.kuu.dao;

import java.awt.Robot;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.kuu.bo.StudentBO;

public final class StudentDAOImpl implements IStudentDAO {
	
	private DataSource ds;
	private Connection conn = null;
	private PreparedStatement ps = null;
	private static final String INSERT_SQL ="insert into layered_spring_student values(spring_student.nextval,?,?,?,?,?,?,?,?,?)";
	

	public StudentDAOImpl(DataSource ds) {
		super();
		this.ds = ds;
	}

	
	


	@Override
	public int add(StudentBO bo) throws Exception {
		
		int rowCount;
		
		try {
			conn = ds.getConnection();
			/*
			 Checking Connection....
			System.out.println("done..");
			System.out.println(conn);
			*/
			ps = conn.prepareStatement(INSERT_SQL);
			ps.setString(1,bo.getName());
			ps.setString(2, bo.getCourse());
			ps.setString(3,bo.getAdddress());
			ps.setInt(4, bo.getMark1());
			ps.setInt(5, bo.getMark2());
			ps.setInt(6, bo.getMark3());
			ps.setInt(7, bo.getTotal());
			ps.setFloat(8, bo.getAvg());
			ps.setString(9,bo.getResult());
			
			 rowCount = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return rowCount;
	}

}
