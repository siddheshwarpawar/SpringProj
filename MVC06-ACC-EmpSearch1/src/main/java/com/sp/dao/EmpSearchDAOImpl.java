package com.sp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.sp.bo.EmpBO;
import com.sp.bo.EmpResultBO;

public class EmpSearchDAOImpl implements EmpSearchDAO {

	private static final String EMP_SEARCH = "SELECT * FROM EMP1 WHERE (ID IS NOT NULL AND ID=?) OR (NAME IS NOT NULL AND NAME=?) OR (DESG IS NOT NULL AND DESG=?) OR (SAL IS NOT NULL AND SAL=?)";
	private JdbcTemplate jt;

	public EmpSearchDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	public List<EmpResultBO> searchEmp(EmpBO bo) {
		/* System.out.println(bo.getId()+".."+bo.getName()+".."+bo.getSal()); */
		List<EmpResultBO> listBO = jt.query(EMP_SEARCH, new rse(), bo.getId(), bo.getName(),
				bo.getDesg(), bo.getSal());
		listBO.forEach(bo4 -> {
			System.out.println(bo4.getId() + ".." + bo4.getName() + ".." + bo4.getDesg());
		});
		return listBO;
	}

	private class rse implements ResultSetExtractor<List<EmpResultBO>> {

		public List<EmpResultBO> extractData(ResultSet rs) throws SQLException, DataAccessException {

			// copy rs record to dto
			List<EmpResultBO> listrbo = null;
			EmpResultBO rbo = null;

			//copy result set record to ListRbo
			listrbo = new ArrayList();
			while(rs.next()) {
				rbo = new EmpResultBO();
				rbo.setId(rs.getInt(1));
				rbo.setName(rs.getString(2));
				rbo.setDesg(rs.getString(3));
				rbo.setSal(rs.getInt(4));
				rbo.setDeptno(rs.getInt(5));
				listrbo.add(rbo);
			}
			return listrbo;
		}

	}
}
