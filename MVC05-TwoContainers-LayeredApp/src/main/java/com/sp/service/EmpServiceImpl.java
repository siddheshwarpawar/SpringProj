package com.sp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.sp.bo.EmpBO;
import com.sp.dao.EmpDAO;
import com.sp.dto.EmpDTO;

public class EmpServiceImpl implements EmpService {
	
	private EmpDAO dao;
	public EmpServiceImpl(EmpDAO dao) {
		this.dao = dao;
	}

	public List<EmpDTO> getAllEmployees() {
		List<EmpDTO> listdto = new ArrayList<>();
		//use dao and get record from dao
		List<EmpBO> listbo = dao.retriveEmpList();
		
		//convert listbo to listdto
		listbo.forEach(bo -> {
			EmpDTO dto = new EmpDTO();
			BeanUtils.copyProperties(bo, dto);
			listdto.add(dto);
		});
		return listdto;
	}

}
