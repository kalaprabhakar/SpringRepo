package com.kuu.comp;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("ct")
public abstract class Cricket {
	@Lookup
	public abstract Bat createBat();
	
	public Cricket() {
		System.out.println("Cricket.Cricket()");
	}
	
	public void balling() {
		System.out.println("Balling................");
	}
	
	public void bating() {
		System.out.println("Bating..................");
		
		
		Bat bat =createBat();
		System.out.println(bat.score());
	}
	
	public void feilding() {
		System.out.println("Feilding....................");
	}
	
	public void wicketKepping() {
		System.out.println("WicketKepping................");
	}

}
