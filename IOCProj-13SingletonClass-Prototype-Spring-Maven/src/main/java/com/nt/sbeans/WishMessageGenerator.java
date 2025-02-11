package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// Target Class
@Component("wmg")
@Scope("prototype")
public class WishMessageGenerator {

	@Autowired
	@Qualifier("dt1")
	private LocalDateTime ldt; // Has-A-Property

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator :: 0-Param Constructor");
	}

	public String generateWishMessgae(String user) {
		System.out.println("WishMessageGenerator.generateWishMessgae()");

		int hour = ldt.getHour();

		if (hour > 12)
			return "Good Morning " + user;

		else if (hour > 16)
			return "Good Afternoon" + user;

		else if (hour > 20)
			return "Good Evening" + user;

		else
			return "Good Night";
	}
}
