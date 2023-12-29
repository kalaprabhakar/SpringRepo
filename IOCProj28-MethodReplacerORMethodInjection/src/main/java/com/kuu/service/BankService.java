package com.kuu.service;

public class BankService {
	
	public double calInterestAmount(double pamt, double rate  , double time) {
		
		System.out.println("BankService.calInterestAmount():::: (Compund Interest)");
		
		
		return (pamt*Math.pow(1+rate/100, time))-pamt;
	}

}
