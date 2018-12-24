package com.sp.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishMsgController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Calendar cal = null;
		int hour = 0;
		cal = Calendar.getInstance();
		
		hour = cal.getTime().getHours();
		
		String res1 = null;
		
		System.out.println(hour);
		if(hour < 12) {
			res1  = "Good Morning";
		}
		else if (hour <16) {
			res1 = "Good Afternoon";
		}
		else if (hour <20) {
			res1 = "Good Evening..";
		}
		else{
			res1 = "Good Night..";
		}
		
		return new ModelAndView("result" , "res2" , res1 );
		
	}

}
