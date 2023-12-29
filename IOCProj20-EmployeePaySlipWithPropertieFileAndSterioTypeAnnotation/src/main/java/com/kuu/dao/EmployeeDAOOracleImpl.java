 package com.kuu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.kuu.javabeans.EmployeeBO;
@Repository("mysqlDAO")
public final class EmployeeDAOOracleImpl implements IEmployeeDAO {
    @Autowired
	private DataSource ds;

	private final static String INSERT_SQL = "insert into layered_spring_employee values(?,?,?,?,?,?)";

	

	@Override
	public int insertEmployee(EmployeeBO bo) throws Exception {

		int result;
		Connection conn = null;
		try {

			 conn = ds.getConnection();
//			System.out.println(conn);

			PreparedStatement preparedStatement = conn.prepareStatement(INSERT_SQL);
			preparedStatement.setInt(1, bo.getEno());
			preparedStatement.setString(2, bo.getEname());
			preparedStatement.setString(3, bo.getDesignation());
			preparedStatement.setFloat(4, bo.getBasic_salary());
			preparedStatement.setFloat(5, bo.getGross_salary());
			preparedStatement.setFloat(6, bo.getNet_salary());

			result = preparedStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}finally {
			try {
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

		return result;
	}

}
