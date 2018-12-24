package com.sp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/welcome.htm")
	public ModelAndView greet() {
		return new ModelAndView("Result", "wish", "WISH==>Have a Good Day..");
	}
}
