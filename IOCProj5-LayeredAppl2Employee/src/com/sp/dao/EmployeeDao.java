package com.sp.dao;

import java.sql.SQLException;

import com.sp.bo.EmployeeBO;

public interface EmployeeDao {

	int insert(EmployeeBO bo) throws SQLException;


}
