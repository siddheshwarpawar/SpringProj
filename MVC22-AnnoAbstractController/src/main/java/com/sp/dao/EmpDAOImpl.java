package com.sp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.sp.bo.EmpBO;

@Repository
public class EmpDAOImpl {
	private static final String GET_RECORD_QUERY = "SELECT EID,ENAME,DESG,SALARY FROM EMP";
	
	@Autowired
	private JdbcTemplate jt;
	
	public List<EmpBO> get(){
		List<EmpBO> listbo = jt.query(GET_RECORD_QUERY, new myResultSetExtractor());
		return listbo;
	}
	
	private class myResultSetExtractor implements ResultSetExtractor<List<EmpBO>>{

		@Override
		public List<EmpBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<EmpBO> listbo = new ArrayList<>();
			while(rs.next()) {
				EmpBO bo = new EmpBO();
				bo.setEid(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setDesg(rs.getString(3));
				bo.setSalary(rs.getInt(4));
				
				listbo.add(bo);
			}
			return listbo;
		}
	}
}
