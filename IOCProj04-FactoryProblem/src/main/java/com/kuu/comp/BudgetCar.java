package com.kuu.comp;

public class BudgetCar extends Car {
	
	private String regNo;
	
	public BudgetCar(String regNo) {
		this.regNo=regNo;
	}

	@Override
	public void drive() {
		System.out.println("Drive Budget Car");
		
		

	}

}
