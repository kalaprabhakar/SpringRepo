package com.kuu.factories;

import com.kuu.comp.BlueKart;
import com.kuu.comp.Courier;
import com.kuu.comp.DTDC;
import com.kuu.comp.Flipkart;

public class FlipkartFactory {
	
	public static Flipkart createFlipkart(String courierType) {
		Flipkart flipkart = new Flipkart();
		Courier courier = null;
		if(courierType.equalsIgnoreCase("dtdc"))
			courier = new DTDC();
		else if(courierType.equalsIgnoreCase("bluekart"))
			courier = new BlueKart();
		else
			throw new IllegalArgumentException("Invalid Courier type");
		flipkart.setCourier(courier);
		return flipkart;
		
	}

}
