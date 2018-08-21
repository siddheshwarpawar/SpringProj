package com.sp.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Student implements BeanFactoryAware, ApplicationContextAware,BeanNameAware, InitializingBean, DisposableBean, BeanPostProcessor {

	private String name;
	private int age;

	// 0- param constructor
	public Student() {
		System.out.println("Student()BPP:: 0 - Parameter constructor");
	}
	
	// Constructor
	public Student(String name) {
		System.out.println("Student.Student()::0- param constructor");
		this.name = name;
	}

	// setter
	public void setAge(int age) {
		System.out.println("setter injection");
		this.age = age;
	}
	
	// postProcessorBeforeInitialization
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization(");
		return"postProcessBeforeInitialization(-,-)";
	}
	
	//postProcessAfterInitialization
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization");
		return "postProcessAfterInitialization(-,-)";
	}
	public void myInit() {
		System.out.println("Student.myInit()");
	}

	public void myDestroy() {
		System.out.println("Student.myDestroy()");
	}

	
	public void afterPropertiesSet() throws Exception {
		System.out.println("Student.afterPropertiesSet()");
	}
	
	

	public void destroy() throws Exception {
		System.out.println("Student.destroy()");

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("ApplixationContext - Aware Injection...");
		
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactory - Aware Injection...");	
	}

	public void setBeanName(String name) {
		System.out.println("BeanName injection..");
		
	}

	
	
}
