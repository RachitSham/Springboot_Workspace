package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

// Target Class
// taking the class as final is strategyDp rule no: 3	
public final class Flipkart {

	private Courier courier; // Has-A-Property (StrategyDP rule no: 1,2)

	// setter method of assignment
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}

	// b.method
	public String shopping(String items[], double prices[]) {

		// calculate bill Amount
		double billAmt = 0.0;
		for (double p : prices) {
			billAmt = billAmt + p;
		}

		// generate the order id(random number as the order)
		int oid = new Random().nextInt(1000);

		// Deliver the products using courier
		String msg = courier.deliver(oid);

		return Arrays.toString(items) + " are purchased having prices " + Arrays.toString(prices) + " Bill Amount ::" + billAmt + "..." + msg;  

	}
}
