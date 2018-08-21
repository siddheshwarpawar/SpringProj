package com.sp.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Viechle implements ApplicationContextAware{

	private Object beanId;
	private ApplicationContext ctx;

	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("Viechle.setApplicationContext()");
		this.ctx = ctx;
	}

	public void setBeanId(Object beanId) {
		this.beanId = beanId;
	}

	// 0 - Parameter constructor
	public Viechle() {
		System.out.println("Viechle() :: 0 - Parameter constructor ");
	}
	
	public void move () {
		Engine engine = ctx.getBean("engg", Engine.class);
		engine.start();
		System.out.println("Viechle is moving");
	}
	
	public void entertainment () {
		System.out.println("Playing music player");
	}
	
	public void blowHorn() {
		System.out.println("Viechle is blowing horn");
	}
}
