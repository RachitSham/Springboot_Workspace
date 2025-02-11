package com.nt.comps;

public class DTDC implements Courier {

	public DTDC() {
		System.out.println("DTDC:: 0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return oid + "Orders Items Are Kept For Delivery by ";
	}

}
