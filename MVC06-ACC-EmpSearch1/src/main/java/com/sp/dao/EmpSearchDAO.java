package com.sp.dao;

import java.util.List;

import com.sp.bo.*;

public interface EmpSearchDAO {
	
	public List<EmpResultBO> searchEmp(EmpBO bo);
}
