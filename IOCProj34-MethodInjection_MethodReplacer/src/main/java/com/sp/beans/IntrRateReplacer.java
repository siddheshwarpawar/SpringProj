package com.sp.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class IntrRateReplacer implements MethodReplacer {

	private float rate;

	public void setRate(float rate) {
		this.rate = rate;
	}

	// 0 - Parameter constructor
	public IntrRateReplacer() {
		System.out.println("IntrRateReplacer.IntrRateReplacer() 0 - Parameter constructor");
	}

	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {

		if (method.getName().equals("calcIntr")) {
			float pAmt = (Float) args[0];
			float time = (Float) args[1];

			return pAmt * time * rate / 100.0f;
		} else {
			return 0.0f;
		} // else

	} // reimplement(-, -, -);

} // class
