package com.kuu.test;

import com.kuu.comp.Flipkart;
import com.kuu.factories.FlipkartFactory;

public class StatergyDPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Flipkart flipkart =FlipkartFactory.createFlipkart();
			String result = flipkart.shopping(new String[]{"pent","shirt","trouser","watch"},new float[] {1000.0f,2000.0f,3000.0f,4000.0f} );
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
