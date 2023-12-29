package com.kuu.comp;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
@Component("ct")
public class Cricket {
	
	public Cricket() {
		System.out.println("Cricket.Cricket()");
	}
	
	public void balling() {
		System.out.println("Balling................");
	}
	
	public void bating() {
		System.out.println("Bating..................");
		
		ClassPathXmlApplicationContext cx = new ClassPathXmlApplicationContext("com/kuu/cfgs/applicationContext.xml");
		Bat bat = cx.getBean("bt",Bat.class);
		System.out.println(bat.score());
	}
	
	public void feilding() {
		System.out.println("Feilding....................");
	}
	
	public void wicketKepping() {
		System.out.println("WicketKepping................");
	}

}
