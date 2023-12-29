package com.kuu.comp;

import java.util.Date;

public class VotingVerification {
	
	private String name;
	private String addr;
	private int age;
	private Date verifyon;
	
	public void setName(String name) {
		System.out.println("VotingVerification.setName()");
		this.name = name;
	}
	public void setAddr(String addr) {
		System.out.println("VotingVerification.setAddr()");
		this.addr = addr;
	}
	public void setAge(int age) {
		System.out.println("VotingVerification.setAge()");
		this.age = age;
	}
	
	public void myinit() {
		System.out.println("Employee.myinit()");
		
		verifyon = new Date();
		
		if(addr == null) {
			System.out.println("Address Not Provided....");
			
		}else if(name==null) {
			throw new IllegalArgumentException("Name Not Found ......");
		}else if(age <= 0 && age > 120  ) {
			throw new IllegalArgumentException("Age is not Valid ......");
		}
	}
	
	public void myDestroy() {
		
		System.out.println("Employee.myDestroy()");
		name= null;
		addr = null;
		age = 0;
		verifyon = null;
	}
	
	public String msg() {
		if(age>18) {
			return "Mr/Mrs/Miss "+name+" You Are Elligible For Voting Your Age is "+age+" varified On "+verifyon;
		}else {
			return "Mr/Mrs/Miss "+name+" You Are Not Elligible For Voting Your Age is "+age+" varified On "+verifyon;
		}
	}
	
	
}
