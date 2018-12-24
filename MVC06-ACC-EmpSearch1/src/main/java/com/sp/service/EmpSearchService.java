package com.sp.service;

import java.util.List;

import com.sp.dto.EmpDTO;
import com.sp.dto.EmpResultDTO;

public interface EmpSearchService {
	
	public List<EmpResultDTO> retrive(EmpDTO dto);
}
