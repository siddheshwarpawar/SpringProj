package com.sp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.sp.command.UserCommand;

public class CRUDController extends MultiActionController {
	public ModelAndView insert(HttpServletRequest req, HttpServletResponse res, UserCommand command) {
		System.out.println(command);
		return new ModelAndView("home", "resultData", "insert");
	}
	
	public ModelAndView update(HttpServletRequest req, HttpServletResponse res, UserCommand command) {
		return new ModelAndView("home", "resultData", "update");
	}
	
	public ModelAndView delete(HttpServletRequest req, HttpServletResponse res, UserCommand command) {
		return new ModelAndView("home", "resultData", "delete");
	}
	
	public ModelAndView view(HttpServletRequest req, HttpServletResponse res, UserCommand command) {
		return new ModelAndView("home", "resultData", "view");
	}
	
	public ModelAndView invalid(HttpServletRequest req, HttpServletResponse res, UserCommand command) {
		return new ModelAndView("home", "resultData", "Invalid..");
	}
}
