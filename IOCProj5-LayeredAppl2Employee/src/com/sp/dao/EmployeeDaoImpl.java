package com.sp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.sp.bo.EmployeeBO;

public class EmployeeDaoImpl implements EmployeeDao {
	private static final String INSERT_QUERY = "INSERT INTO L_EMPLOYEE VALUES (?, ?, ?, ?, ?)";
	private DataSource ds;
	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	
	@Override
	public int insert(EmployeeBO bo) throws SQLException {
		System.out.println("EmployeeDaoImpl.insert()");
		Connection con = null;
		PreparedStatement ps = null;
		int count  = 0 ;
		// Get jdbc connection
		con = ds.getConnection();
		//create prepared statement object
		ps = con.prepareStatement(INSERT_QUERY);
		//set value to query params
		ps.setInt(1, bo.getEno());
		ps.setString(2, bo.getEname());
		ps.setInt(3,bo.getBasicSalary());
		ps.setInt(4, bo.getGrossSalary());
		ps.setInt(5, bo.getNetSalary());
		
		count = ps.executeUpdate();
		return count;
	}


}
