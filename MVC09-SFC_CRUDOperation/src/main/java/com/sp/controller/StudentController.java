package com.sp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.sp.dto.EmpDTO;
import com.sp.service.EmpService;

public class StudentController extends AbstractController {

	public EmpService serv;
	public StudentController(EmpService serv) {
		this.serv = serv;
	}


	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		List<EmpDTO> listdto = serv.retrive();
		listdto.forEach(dto-> {
			System.out.println(dto.getEid());
		});
		
		return new ModelAndView("result", "emplist", listdto);
	}

}
