package com.sp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.sp.command.MyCommand;
import com.sp.dto.EmpDTO;
import com.sp.dto.EmpResultDTO;
import com.sp.service.EmpSearchService;

public class EmpSearchController extends AbstractCommandController {

	public EmpSearchService ser;

		public void setSer(EmpSearchService ser) {
		this.ser = ser;
	}


	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		
		// get the command object
		MyCommand cmd = (MyCommand) command;

		//Convert cmd to dto
		EmpDTO dto = new EmpDTO();
		
		dto.setId(cmd.getId());
		dto.setName(cmd.getName());
		dto.setDesg(cmd.getDesg());
		dto.setSal(cmd.getSal());
			
		//use service class
		List<EmpResultDTO> listdto = ser.retrive(dto);
		/*listdto.forEach(dto1 -> {
			dto1.getId();
			dto1.getName();
			dto1.getSal();
		});
		*/
		return new ModelAndView("result", "resList", listdto);
	}
}
