package com.nt.comps;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//this  class implementing common interface is for rule2
//taking the class as final  is strategyDP rule no:3
@Component("dtdc")
//@Primary
@Lazy(true)
public class DTDC implements ICourier{

	public DTDC() {
		System.out.println("DTDC :: 0- Param Constructor");
		
	}
	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return oid + "Orders are kept for Delivery by DTDC ";
	}

}
