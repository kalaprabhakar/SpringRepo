package com.kuu.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	private Date date;
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator : 0-param Constructor");
	}
	
	public WishMessageGenerator(Date date) {
		this.date= date;
		}
	
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
	
	public String genrateMessage(String user) {
		System.out.println("WishMessageGenerator.genrateMessage()::"+date);
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
