package com.nt.comps;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("bluedart")
@Component("transporter")
//@Primary
@Lazy(true)
public class BlueDart implements ICourier {

	public BlueDart() {
		System.out.println("BlueDart.BlueDart :: 0-Param Constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");

		return oid + "Orders items are kept for Delivery by BulrDart ";
	}

}
