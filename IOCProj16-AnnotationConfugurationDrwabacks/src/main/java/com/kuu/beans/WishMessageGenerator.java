package com.kuu.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WishMessageGenerator {
	@Autowired
	@Qualifier("dt2")
	private Date date;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator : 0-param Constructor");
	}
	
	
	
	public String genrateMessage(String user) {
		System.out.println("WishMessageGenerator.genrateMessage():::"+date );
		int hour = date.getHours();
		if(hour <12)
			return "GOOD MORNING "+user;
		else if(hour<16)
			return "GOOD AFTERNOON "+user;
		else if(hour<20)
			return "GOOD EVENING "+user;
		else
			return "GOOD NIGHT "+user;
	}

}
