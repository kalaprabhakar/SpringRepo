package com.kuu.comp;

import java.util.Arrays;
import java.util.Random;

public class Vehicle {
	
	private Engine engine ;
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	int eno = new Random().nextInt(10000);
	
	String type = engine.type();
	
	public String festures(String [] parts , float [] price) {
		
		float totalbill = 0.0f;
		
		for(float prices : price) {
			totalbill +=prices;
			
		}
		
		String msg  = Arrays.toString(parts)+" having price "+ Arrays.toString(price)+" totali bill is "+totalbill;
		
		return type+"\n"+msg;
	}

}
