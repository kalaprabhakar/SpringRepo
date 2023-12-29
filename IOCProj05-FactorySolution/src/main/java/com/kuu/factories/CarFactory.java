package com.kuu.factories;

import com.kuu.comp.BudgetCar;
import com.kuu.comp.Car;
import com.kuu.comp.LuxeryCar;
import com.kuu.comp.SportsCar;

public class CarFactory {
	
	private Car car ;
	
	public static Car getCar(String type,String regNo) {
		if(type.equalsIgnoreCase("sport")) {
		
			
			return  new SportsCar(regNo);
		}else if(type.equalsIgnoreCase("budget")) {
			 return new BudgetCar(regNo);
		}else if(type.equalsIgnoreCase("luxery")) {
			return new LuxeryCar(regNo);
		}else {
			throw new IllegalArgumentException("Invalid car Type");
		}
	}

}
