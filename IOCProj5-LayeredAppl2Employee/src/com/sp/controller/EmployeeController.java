package com.sp.controller;

import java.sql.SQLException;

import com.sp.dto.EmployeeDTO;
import com.sp.service.EmployeeService;
import com.sp.vo.EmployeeVO;

public class EmployeeController {
	
	private EmployeeService service;
	/**
	 * @param service the service to set
	 */
	public void setService(EmployeeService service) {
		this.service = service;
	}

	public String processEmployee(EmployeeVO vo) throws SQLException {
		
		//Convert VO to DTO
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEno(Integer.parseInt(vo.getEno()));
		dto.setEname(vo.getEname());
		dto.setCompany(vo.getCompany());
		dto.setAddress(vo.getAddress());
		dto.setBasicSalary(Integer.parseInt(vo.getBasicSalary()));
		
		//use service class
		String result  = service.genrateResult(dto);
		return result;
	}
}
