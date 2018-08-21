package com.sp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.sp.dto.EmployeeDTO;
import com.sp.service.EmployeeService;
import com.sp.vo.EmployeeVO;

public class MainController {

	// Injecting this to service class
	EmployeeService service = null;
	
	public MainController(EmployeeService service) {
		this.service = service;
	}
	
	// use the service class 
	public List<EmployeeVO> getEmpByDesg(String desg[])throws Exception
	{
		EmployeeVO vo = null;
		List <EmployeeVO> listVO = new ArrayList<EmployeeVO>();
		List <EmployeeDTO> listDTO ;
		listDTO = service.getEmpByDesg(desg);
		
		// copy the dto to vo
//		EmployeeDTO dto = new EmployeeDTO();
		for(EmployeeDTO dto:listDTO){
			//Copy Each DTO class obj to each VO class obj
			vo=new EmployeeVO();
			//BeanUtils.copyProperties(dto,vo);  //we can not use becoz types are not matching
			
			vo.setEno(dto.getEno());
			vo.setEname(dto.getEname());
			vo.setDesg(dto.getDesg());
			vo.setSalary(dto.getSalary());
			//add VO class obj to listVO
			listVO.add(vo);
		}//for
		
		return listVO;
		
	}	
	
}
