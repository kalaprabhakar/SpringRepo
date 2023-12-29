package com.kuu.comp;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
@Component("ct")
public class Cricket implements ApplicationContextAware {
	
	private ApplicationContext applicationContext ;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		this.applicationContext= applicationContext;
	}
	
	public Cricket() {
		System.out.println("Cricket.Cricket()");
	}
	
	public void balling() {
		System.out.println("Balling................");
	}
	
	public void bating() {
		System.out.println("Bating..................");
		
		
		Bat bat = applicationContext.getBean("bt",Bat.class);
		System.out.println(bat.score());
	}
	
	public void feilding() {
		System.out.println("Feilding....................");
	}
	
	public void wicketKepping() {
		System.out.println("WicketKepping................");
	}

	

}
