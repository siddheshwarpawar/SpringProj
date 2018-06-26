package com.sp.service;


import java.sql.SQLException;

import com.sp.bo.EmployeeBO;
import com.sp.dao.EmployeeDao;
import com.sp.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao dao;
	/**
	 * @param dao the dao to set
	 */
	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

	
	@Override
	public String genrateResult(EmployeeDTO dto) throws SQLException {
		
		//  Business  logic
		System.out.println("EmployeeServiceImpl.genrateResult()");
		int grossSalary = 0,  netSalary = 0;
		grossSalary = Math.round(dto.getBasicSalary() + dto.getBasicSalary()*0.3f);
		netSalary = Math.round(grossSalary-(grossSalary*0.2f));
		
		// Prepare BO object having persistable data which we are dumping in the database
		EmployeeBO  bo = new EmployeeBO();
		bo.setEno(dto.getEno());
		bo.setEname(dto.getEname());
		bo.setBasicSalary(dto.getBasicSalary());
		bo.setGrossSalary(grossSalary);
		bo.setNetSalary(netSalary);
		
		
		// Use dao
		int count = dao.insert(bo);
		if(count == 0)
			return "\n \t GrossSalary::"+grossSalary+" \n \t Net Salary ::"+netSalary+"Sorry .. Registration Failed..";
		else {
			return "\n \t GrossSalary::"+grossSalary+" \n \t Net Salary ::"+netSalary+"Enjoy.. Registration Successful..";
		}
	}

}
