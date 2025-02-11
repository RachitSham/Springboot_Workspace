package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements ICourier {
	
	public DTDC () {
		System.out.println("DTDC :: 0 Param Constructor ");
		
	}

	@Override
	public String deliver(int oid) {
		
		return " DTDC BlueDart Courier Is Ready To Deliver " + oid + " Order Number Products ";
	}

	
}
