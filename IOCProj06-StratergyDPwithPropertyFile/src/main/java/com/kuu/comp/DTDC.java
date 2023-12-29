package com.kuu.comp;

public class DTDC implements Courier {
	
	public DTDC() {
		System.out.println("DTDC.DTDC()");
	}

	@Override
	public String delivery(int oid) {
		return oid+" Order Id is delivered by DTDC";

	}

}
