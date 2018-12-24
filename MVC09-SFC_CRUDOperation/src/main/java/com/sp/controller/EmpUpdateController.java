package com.sp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.sp.command.EmpCommand;
import com.sp.dto.EmpDTO;
import com.sp.service.EmpServiceImpl;

public class EmpUpdateController extends SimpleFormController {

	private EmpServiceImpl serv;
	public EmpUpdateController(EmpServiceImpl serv) {
		this.serv = serv;
	}

	@Override
	public Object formBackingObject(HttpServletRequest request) throws Exception {
		
		int eid = Integer.parseInt(request.getParameter("id"));
		// use serv
		EmpDTO dto = serv.getEmp(eid);
		// Convert dto to command
		EmpCommand cmd = new EmpCommand();
		cmd.setEid(dto.getEid());
		cmd.setEname(dto.getEname());
		cmd.setDesg(dto.getDesg());
		cmd.setSalary(dto.getSalary());
		return cmd;
	}
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		EmpCommand comand = (EmpCommand) command;
		//convert command to dto
		EmpDTO dto  = new EmpDTO();
		BeanUtils.copyProperties(comand, dto);
		//use service
		String result = serv.updateEmp(dto);
		return new ModelAndView("updateResult", "resultMsg", result);
	}
}
