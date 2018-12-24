package com.sp.service;

import java.util.List;

import com.sp.bo.EmpBO;
import com.sp.dto.EmpDTO;

public interface EmpService {

	public List<EmpDTO> retrive();
	public String saveEmp(EmpDTO dto);
	public String removeEmp(int eid);
	public EmpDTO getEmp (int eid);
	public String updateEmp(EmpDTO dto);
}
