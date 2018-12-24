package com.sp.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.sp.bo.EmpBO;
import com.sp.bo.EmpResultBO;
import com.sp.dao.EmpSearchDAO;
import com.sp.dto.EmpDTO;
import com.sp.dto.EmpResultDTO;

public class EmpSearchServiceImpl implements EmpSearchService {

	private EmpSearchDAO dao;
	public EmpSearchServiceImpl(EmpSearchDAO dao) {
		this.dao = dao;
	}

	public List<EmpResultDTO> retrive(EmpDTO dto) {
		EmpBO bo = new EmpBO();
		//convert dto to bo
		BeanUtils.copyProperties(dto, bo);
		// use dao
		List<EmpResultBO> listbo = dao.searchEmp(bo);
		//convert coming listbo to listdto
		List<EmpResultDTO> listdto = new ArrayList<EmpResultDTO>();
		
		for (EmpResultBO bo1 : listbo) {
			EmpResultDTO dto1 = new EmpResultDTO();
			dto1.setId(bo1.getId());
			dto1.setName(bo1.getName());
			dto1.setDesg(bo1.getDesg());
			dto1.setSal(bo1.getSal());
			dto1.setDeptno(bo1.getDeptno());
			listdto.add(dto1);
		}
		return listdto;
	}

}
