package com.kuu.test;

import com.kuu.comp.Car;
import com.kuu.comp.LuxeryCar;
import com.kuu.comp.SportsCar;
import com.kuu.factories.CarFactory;

public class YouthCustomer3 {

	public static void main(String[] args) {
		
		Car car = CarFactory.getCar("sport", "OD07 5555");
		car.drive();
		

	}

}
