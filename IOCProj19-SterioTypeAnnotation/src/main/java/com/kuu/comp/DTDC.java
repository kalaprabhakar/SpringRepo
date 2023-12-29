package com.kuu.comp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements Courier {
	
	public DTDC() {
		System.out.println("DTDC.DTDC()");
	}

	@Override
	public String delivery(int oid) {
		System.out.println();
		return oid+" Order Id is delivered by DTDC";

	}

}
