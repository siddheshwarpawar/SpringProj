package com.sp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sp.dto.StudentDTO;
import com.sp.service.StudentService;
import com.sp.vo.StudentVO;

@Component("mainController")
public class StudentController {

	@Autowired
	private StudentService service;
	// Constructor for constructor injection
	//	public StudentController (StudentService service) {
	//		this.service = service;
	//	}
	
	
	public String process(StudentVO vo)throws Exception {
		// Convert  VO  object  to  DTO
		StudentDTO dto = new StudentDTO();
//		dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setName(vo.getSname());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		
		// Use  Service  class  by  using  these  DTO  object
		String result = service.genrateResult(dto);
		return result;
	}
}
