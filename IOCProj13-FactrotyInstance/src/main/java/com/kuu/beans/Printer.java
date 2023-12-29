package com.kuu.beans;

public class Printer {
	
	private Printer() {
		System.out.println("Printer.Printer()");
		
	}
	
	private static Printer INSTANCE;
	
	public static Printer getInstance() {
		if(INSTANCE==null) 
			INSTANCE = new Printer();
			return INSTANCE;
			
		
	}

}
