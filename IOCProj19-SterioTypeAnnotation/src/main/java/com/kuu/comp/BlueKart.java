package com.kuu.comp;

import org.springframework.stereotype.Component;

@Component("bdart")
public class BlueKart implements Courier {
	
	public BlueKart() {
		// TODO Auto-generated constructor stub
		System.out.println("BlueKart.BlueKart()");
	}

	@Override
	public String delivery(int oid) {
		
		return oid+" Order id is delivered by BlueKart";
	}

}
