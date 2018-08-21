package com.sp.service;

import java.util.List;

import com.sp.dto.EmployeeDTO;

public interface EmployeeService {
	
	
	public List<EmployeeDTO> getEmpByDesg(String desg[])throws Exception;


}
