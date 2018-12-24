package com.sp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.sp.dto.EmpDTO;
import com.sp.service.EmpService;

public class EmployeeController extends AbstractController {

	private EmpService serv = null;
	public EmployeeController(EmpService serv) {
		this.serv = serv;
	}

	List<EmpDTO> listDTO = null;
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		listDTO = serv.getAllEmployees();
		
		/*ModelAndView mav = new ModelAndView();
		mav.setViewName("result");
		mav.addObject("allEmps", listDTO);*/
	
		return new ModelAndView("result", "allEmps", listDTO);
	}
}
