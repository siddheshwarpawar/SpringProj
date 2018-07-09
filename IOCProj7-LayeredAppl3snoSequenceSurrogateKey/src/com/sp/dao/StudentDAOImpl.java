package com.sp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.sp.bo.StudentBO;

public class StudentDAOImpl  implements StudentDAO{

	private static final String STUDENT_INSERT_QUERY = "INSERT INTO SPRING_STUDENT VALUES(sno.nextVal, ?, ?, ?, ?)";
	
	// Parameterized  constructor  to inject ds
	private DataSource drds;
	public StudentDAOImpl(DataSource drds) {
		super();
		this.drds = drds;
	}
	
	
	@Override
	public int insert(StudentBO bo) throws Exception {
	//  JDBC code to insert record
		try {
			// Get  JDBC Connection
			Connection con = drds.getConnection();
			// Create PreparedStatement object
			PreparedStatement psmt = con.prepareStatement(STUDENT_INSERT_QUERY);
			// Set  Query  parameter value
		//	psmt.setInt(1, bo.getSno());
			psmt.setString(1, bo.getSname());
			psmt.setInt(2, bo.getTotal());
			psmt.setFloat(3, bo.getAvg());
			psmt.setString(4, bo.getResult());
			int result = psmt.executeUpdate();
			psmt.close();
			con.close();
			return result;
			
		}
		
		catch (SQLException se) {
			return 0;
		}
		catch (Exception e) {
			return 0;
		}
	}// insert()
}// Class
