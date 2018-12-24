package com.sp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.sp.dto.EmpDTO;
import com.sp.service.EmpServiceImpl;

public class EmpDeleteController extends AbstractController {

	private EmpServiceImpl serv;
	public EmpDeleteController(EmpServiceImpl serv) {
		this.serv = serv;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		int count = Integer.parseInt(request.getParameter("id"));
		//use service
		// deletion status
		String result = serv.removeEmp(count);
		//show report data as well
		List<EmpDTO> dto = serv.retrive();
		ModelAndView mav = new ModelAndView();
		mav.addObject("resMsg", result);
		mav.addObject("emplist", dto);
		mav.setViewName("result");
		
		return mav;
	}

}
