package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bluedart")
public final class BlueDart implements ICourier{
	
	public BlueDart() {
		System.out.println("BlueDart :: 0 Param Constructor");
	}

	@Override
	public String deliver(int oid) {
		
		return " BlueDart Courier Is Ready To Deliver " + oid + " Order Number Products ";
	}

}
