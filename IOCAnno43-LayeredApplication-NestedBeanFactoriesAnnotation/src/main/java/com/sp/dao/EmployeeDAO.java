package com.sp.dao;

import java.util.List;

import com.sp.bo.EmployeeBO;


public interface EmployeeDAO {

																											
	public List<EmployeeBO> retriveEmployeeByDesg(String cond)throws Exception;

}
