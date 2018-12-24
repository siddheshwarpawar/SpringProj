package com.sp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.w3c.dom.views.AbstractView;

public class HomePageController extends AbstractController{

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		return new ModelAndView("Home");
	}

}
