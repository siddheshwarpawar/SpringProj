package com.sp.dao;

import java.util.List;

import com.sp.bo.EmpBO;
import com.sp.dto.EmpDTO;

public interface EmpDAO {
	
	public List<EmpBO> getEmps();
	
	public int insertData(EmpBO bo);

	public int deleteRecord(int eid);

	public EmpBO getEmpByEid(int eid);
	
	public int updateRecord(EmpBO bo);
}

