package com.kuu.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class CalInterestAmountReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("CalInterestAmountReplacer.reimplement():::: (Simple Intreste)");
		
		double pamt  = (double)args[0];
		double rate = (double) args[1];
		double time = (double) args[2];
		
		
		return pamt*rate*time /100;
	}

}
