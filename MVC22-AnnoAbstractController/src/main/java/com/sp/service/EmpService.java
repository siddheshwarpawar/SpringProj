package com.sp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.bo.EmpBO;
import com.sp.dao.EmpDAOImpl;
import com.sp.dto.EmpDTO;

@Service
public class EmpService {
	
	@Autowired
	public EmpDAOImpl dao;
	
	public List<EmpDTO> retriveEmp(){
		List<EmpBO> listbo = dao.get();
		//convert listbo to listdto
		List<EmpDTO> listdto = new ArrayList<>();
		listbo.forEach(bo -> {
			EmpDTO dto = new EmpDTO();
			BeanUtils.copyProperties(bo, dto);
			listdto.add(dto);
		});
		return listdto;
	}
}
