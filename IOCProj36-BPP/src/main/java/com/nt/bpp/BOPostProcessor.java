package com.nt.bpp;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.nt.bo.BaseBO;

/**
 * @author $IDDHU
 *
 */
public class BOPostProcessor implements BeanPostProcessor {
	
 public BOPostProcessor () {
		System.out.println("BOPostProcessor  -  0 - Parameter constructor");
		}
	
 /* (non-Javadoc)
 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessBeforeInitialization(java.lang.Object, java.lang.String)
 */
public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	System.out.println("BOPostProcessor.postProcessBeforeInitialization(-, - )");
	if(bean instanceof BaseBO) {
		((BaseBO) bean).setDoj(new Date());
	}
	return bean;
	}
 

 /* (non-Javadoc)
 * @see org.springframework.beans.factory.config.BeanPostProcessor#postProcessAfterInitialization(java.lang.Object, java.lang.String)
 */
public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BOPostProcessor.postProcessAfterInitialization(- , -)");
		return bean;
	}
} 
