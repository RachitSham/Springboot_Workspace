package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myn")
public final class Myntra {

	@Autowired
	@Qualifier("bluedart")
	private ICourier Courier;

	public Myntra() {
		System.out.println("Myntra.Myntra()");
	}

	public String shopping(String items[], double price[]) {
		System.out.println("Myntra.shopping()");
		double billamt = 0;
		for (double p : price) {
			billamt = billamt + p;

		}

		// generate order id randomly
		int oid = new Random().nextInt(10000);

		// deliver order using courier
		String msg = Courier.deliver(oid);
		return Arrays.toString(items) + " are shopped Having Bill Amount " + "-----" + msg;
	}

}
