package com.sp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.sp.bo.EmpBO;

public class EmpDAOImpl implements EmpDAO {

	private JdbcTemplate jt;
	
	public EmpDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	private final String GET_ALL_EMP = "SELECT EID,ENAME, DESG, SALARY FROM EMP";

	public List<EmpBO> retriveEmpList() {
		List<EmpBO> listBo = null;

		listBo = jt.query(GET_ALL_EMP, new EmpExtractor());

		return listBo;
	}

	private class EmpExtractor implements ResultSetExtractor<List<EmpBO>> {

		public List<EmpBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<EmpBO> listbo = null;
			EmpBO bo = null;
			listbo = new ArrayList<EmpBO>();

			while (rs.next()) {
				bo = new EmpBO();
				bo.setEid(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setDesg(rs.getString(3));
				bo.setSalary(rs.getInt(4));

				listbo.add(bo);
			}
			return listbo;
		}// extract-Data()
	}//inner class
}// class
