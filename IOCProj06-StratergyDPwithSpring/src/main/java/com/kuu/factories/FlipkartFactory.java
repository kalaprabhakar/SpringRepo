package com.kuu.factories;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import com.kuu.comp.BlueKart;
import com.kuu.comp.Courier;
import com.kuu.comp.DTDC;
import com.kuu.comp.Flipkart;

public class FlipkartFactory {
	
	private static Properties props;
	static{
		
		try(FileInputStream fileInputStream = new FileInputStream("src/main/java/com/kuu/property/info.properties")){
			
			props = new Properties();
			props.load(fileInputStream);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Flipkart createFlipkart() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Flipkart flipkart = new Flipkart();
		Courier courier = null;
		
		Class c = Class.forName(props.getProperty("dependent.comp"));
		
		Constructor cons [] = c.getDeclaredConstructors();
		
		courier = (Courier) cons[0].newInstance();
		
		flipkart.setCourier(courier);
		return flipkart;
		
	}

}
