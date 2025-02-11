package com.nt.comps;

public final class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("BlueDart :: 0-Param Constructor ! ");
	}
	
	
	@Override
	public String deliver(int oid) {

		System.out.println("BlueDart.deliver()");
		return oid + "Orders items are kept for Delivery by BlueDart!";
	}

}
