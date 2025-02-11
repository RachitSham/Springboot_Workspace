package com.nt.testing;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class strategyPatternTest {

	public static void main(String[] args) {

		// use factory pattern to target class obj

		Flipkart fpkt = FlipkartFactory.getInstance("DTDC");

		// Invoke the b.method
		String resultMsg = fpkt.shopping(new String[] { "Shirt", "Troser" }, new double[] { 5000.0, 6000.0 });
		System.out.println(resultMsg);
		
		System.out.println("********************************************");
		
		Flipkart fpkt1 = FlipkartFactory.getInstance("BlueDart");

		// Invoke the b.method
		String resultMsg1 = fpkt.shopping(new String[] { "Shirt", "Troser" }, new double[] { 5000.0, 6000.0 });
		System.out.println(resultMsg);
	}

}
