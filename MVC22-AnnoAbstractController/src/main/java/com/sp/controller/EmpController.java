package com.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sp.dto.EmpDTO;
import com.sp.service.EmpService;

@Controller
public class EmpController {
	@Autowired
	public EmpService service;
	
	@RequestMapping("/result.htm")
	public void process(Model map) {
		// use service
		List<EmpDTO> listdto = service.retriveEmp();
		map.addAttribute("listResult", listdto);

	}
}
