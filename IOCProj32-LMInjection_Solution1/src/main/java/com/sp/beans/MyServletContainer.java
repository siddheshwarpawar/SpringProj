//  #   BY    USING AWARE INJECTION
package com.sp.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyServletContainer implements ApplicationContextAware {

	ApplicationContext ctx;
	public String ms;

	
	
	public MyServletContainer() {
		System.out.println("MyServletContainer.MyServletContainer() - 0 parmaeterized constructor");
	}

	public void processRequest(String data) {
		MyRequestHandler handler = ctx.getBean(ms, MyRequestHandler.class);
		handler.handle(data);
	}

	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx = ctx;
	}

	public void setMs(String ms) {
		this.ms = ms;
	}

	
}
