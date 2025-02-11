package com.nt.comps;

import org.springframework.stereotype.Component;

//this  class implementing common interface is for rule2
//taking the class as final  is strategyDP rule no:3
@Component("dhl")
//@Component("transporter")
//@Primary
public class DHL implements ICourier{

	public DHL() {
		System.out.println("DHL.DHL()");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DHL.deliver()");
		return oid+" order id order  items  ready to deliver using  DHL  Courier Service";
	}
	
	

}
