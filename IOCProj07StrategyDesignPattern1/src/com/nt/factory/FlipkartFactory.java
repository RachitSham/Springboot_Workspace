package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;

public class FlipkartFactory {

	public static Flipkart getInstance(String courierType) {
		
		// create dependent class Object 
		Courier courier = null;
		
		if(courierType.equalsIgnoreCase("BlueDart")) 
			courier = new BlueDart();
		
		else if (courierType.equalsIgnoreCase("DTDC"))
			courier = new DTDC();
		
		else
			throw new IllegalArgumentException("Invalid Courier type");
		
		// create target class object
		
		Flipkart fpkt = new Flipkart();
		
		fpkt.setCourier(courier);
		
		// assign dependent class object to target class object
		return fpkt;
	}
}
