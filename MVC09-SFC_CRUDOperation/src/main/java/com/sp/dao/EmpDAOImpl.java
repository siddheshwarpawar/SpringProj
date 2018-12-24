package com.sp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.sp.bo.EmpBO;
import com.sp.dto.EmpDTO;

public class EmpDAOImpl implements EmpDAO {

	private static final String GET_ALL_EMPS_QUERY  = "SELECT * FROM EMP";
	private static final String GET_STUDENT_BY_EID  = "SELECT * FROM EMP WHERE EID = ?";
	private static final String INSERT_RECORD_QUERY = "INSERT INTO EMP VALUES (?, ?, ?, ?)";
	private static final String DELETE_RECORD_QUERY = "DELETE FROM EMP WHERE EID = ?";
	private static final String UPDATE_RECORD_QUERY = "UPDATE EMP SET ENAME=?, DESG=?, SALARY=? WHERE EID=?";
	
	private JdbcTemplate jt;
	public EmpDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	
	public List<EmpBO> getEmps() {
		List<EmpBO> listbo = jt.query(GET_ALL_EMPS_QUERY, new EmpResulSetEx());
		return listbo;
	}
	
	
	private class EmpResulSetEx implements ResultSetExtractor<List<EmpBO>>{

		List<EmpBO> bo = null;
		public List<EmpBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			//convert rs to listbo
			bo = new ArrayList<EmpBO>();
			EmpBO empbo = null;
			
			while (rs.next()) {
				empbo = new EmpBO();
				empbo.setEid(rs.getInt(1));
				empbo.setEname(rs.getString(2));
				empbo.setDesg(rs.getString(3));
				empbo.setSalary(rs.getInt(4));
				
				bo.add(empbo);
			}//while
			return bo;
		}//extractData()
	}//inner class

	
	@Override
	public int insertData(EmpBO bo) {
		// Use dao
		int count = jt.update(INSERT_RECORD_QUERY, bo.getEid(), bo.getEname(), bo.getDesg(), bo.getSalary());
		return count;
	}

	@Override
	public int deleteRecord(int eid) {
		
		int count = jt.update(DELETE_RECORD_QUERY, eid);
		return count;
	}

	@Override
	public EmpBO getEmpByEid(int eid) {
		
		EmpBO bo  = jt.queryForObject(GET_STUDENT_BY_EID, new empMapper(), eid);
		return bo;
	}
	
	private class empMapper implements RowMapper<EmpBO>{

		@Override
		public EmpBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			EmpBO bo = new EmpBO();
			bo.setEid(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setDesg(rs.getString(3));
			bo.setSalary(rs.getInt(4));
			
			return bo;
		}
		
	}
	
	
	@Override
	public int updateRecord(EmpBO bo) {
		//System.out.println(bo.getEname() +"-"+bo.getDesg()+"-"+bo.getSalary());
		int count=0;
		try {
		count = jt.update(UPDATE_RECORD_QUERY, bo.getEname(), bo.getDesg(), bo.getSalary(), bo.getEid());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println(count);
		return count;
	}

}
