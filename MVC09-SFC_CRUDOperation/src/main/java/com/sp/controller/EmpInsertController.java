package com.sp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.sp.command.EmpCommand;
import com.sp.dto.EmpDTO;
import com.sp.service.EmpService;

public class EmpInsertController extends MultiActionController {
	
	public EmpService service;
	public EmpInsertController(EmpService service) {
		this.service = service;
	}
	
	public ModelAndView add(HttpServletRequest req, HttpServletResponse res, EmpCommand command) {
		//convert command to dto
		EmpDTO dto = new EmpDTO();
		BeanUtils.copyProperties(command, dto);
		// Use service
		String result = service.saveEmp(dto);
		return new ModelAndView("EmpInsert", "res", result);
	}
	
	public ModelAndView invalid(HttpServletRequest req, HttpServletResponse res, EmpCommand command) {
		return new ModelAndView("EmpInsert", "res", "Please select the proper button");
	}
	
}
