package com.kuu.test;

import com.kuu.comp.Car;
import com.kuu.comp.LuxeryCar;
import com.kuu.factories.CarFactory;

public class BussnessManCustomer1 {

	public static void main(String[] args) {
		
		Car car = CarFactory.getCar("luxery", "OD07 5555");
		car.drive();
		

	}

}
