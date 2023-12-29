package com.kuu.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	
	private Courier courier;
	
	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	public String shopping(String items[], float price []) {
		float totalbill = 0.0f;
		for(int i=0; i<price.length;i++) {
			totalbill = totalbill + price[i];
		}
		
		int oid = new Random().nextInt(10000);
		String status = courier.delivery(oid);
		
		String finalmsg = Arrays.toString(items)+"are purchesed in price "+Arrays.toString(price)+"The generated bill is"+totalbill;
		
		return finalmsg+":::\n"+status;
	}

}
