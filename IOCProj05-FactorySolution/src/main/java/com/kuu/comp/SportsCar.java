package com.kuu.comp;

public class SportsCar extends Car {
	
	private String regNo;
	
	public SportsCar(String regNo) {
		this.regNo=regNo;
	}

	@Override
	public void drive() {
		System.out.println("Drive Sports Car");
		
		

	}

}
