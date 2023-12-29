package com.kuu.comp;

public class LuxeryCar extends Car {
	
	private String regNo;
	
	public LuxeryCar(String regNo) {
		this.regNo=regNo;
	}

	@Override
	public void drive() {
		System.out.println("Drive Luxery Car");
		
		

	}

}
