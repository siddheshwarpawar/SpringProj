package com.sp.service;

import java.sql.SQLException;

import com.sp.dto.EmployeeDTO;

public interface EmployeeService {

	String genrateResult(EmployeeDTO dto) throws SQLException;
}
