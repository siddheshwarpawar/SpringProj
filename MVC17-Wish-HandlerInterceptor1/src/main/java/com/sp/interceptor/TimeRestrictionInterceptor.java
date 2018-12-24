package com.sp.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TimeRestrictionInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Calendar cal = null;
		cal = Calendar.getInstance();
		int hour = cal.HOUR_OF_DAY;
		if(hour>15 && hour<17) {
			System.out.println("TimeRestrictionInterceptor.preHandle()");
			response.sendRedirect("timeout.jsp");	
		}
			return true;
	}
}
