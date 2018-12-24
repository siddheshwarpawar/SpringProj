package com.sp.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sp.command.UserCommand;
import com.sp.dto.UserDTO;
import com.sp.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	public LoginService service;
	
	@RequestMapping(value="/login.htm", method=RequestMethod.GET)
	public String showForm(@ModelAttribute("userCmd") UserCommand cmd) {
		return "login";
	}
	
	@RequestMapping(value="/login.htm", method=RequestMethod.POST)
	public String processForm(Map<String, Object> map, @ModelAttribute("userCmd") UserCommand cmd) {
		// Convert command to dto
		UserDTO dto = new UserDTO();
		BeanUtils.copyProperties(cmd, dto);
		// Use service
		String resultMsg = service.checkValidUser(dto);
		// Set Result to map which will stored in request Attribute
		map.put("resultMsg", resultMsg);
		// Return viewName
		if(resultMsg.equalsIgnoreCase("Authenticated User")) {
			return "success";
		}
		else {
			return "login";
		}
	}//processForm(-, -)
}// class