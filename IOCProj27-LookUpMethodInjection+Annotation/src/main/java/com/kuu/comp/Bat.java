package com.kuu.comp;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component("bt")
public class Bat {
	
	public Bat() {
		System.out.println("Bat.Bat()");
		
	}
	
	public int score() {
		int run;
		return run = new Random().nextInt(200); 
	}

}
