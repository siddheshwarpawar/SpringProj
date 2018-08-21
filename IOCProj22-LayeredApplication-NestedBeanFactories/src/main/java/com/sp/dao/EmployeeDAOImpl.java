package com.sp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.sp.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {

	Connection con = null;
	Statement st = null;
	String query = null;
	ResultSet rs = null;
	EmployeeBO bo = null;

	private DataSource ds;
	// inject the DataSource object
	public EmployeeDAOImpl(DataSource ds) {
		this.ds = ds;
	}
	
	
		public List<EmployeeBO> retriveEmployeeByDesg(String cond) throws Exception {

			// Write jdbc to retrive the data
			con = ds.getConnection();
			
			// Create statement object
			st = con.createStatement();
			
			//  Prepare the  query
			query = "SELECT * FROM EMP0 WHERE DESG IN"+cond+"ORDER BY DESG";	
			
			// Send and execute the query
			rs = st.executeQuery(query);
			
			//Copy the ResultSet object data to BO class object
		
			List<EmployeeBO> listBO = new ArrayList<EmployeeBO>();
			
			while(rs.next()) {
				bo = new EmployeeBO();
				bo.setEno(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setDesg(rs.getString(3));
				bo.setSalary(rs.getInt(4));
				listBO.add(bo);
			}
			
			rs.close();
			st.close();
			con.close();
		
			return listBO;
	}// Method

} // Class
