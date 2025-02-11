package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@Autowired // field injection
	private LocalTime lt; // HAS-A-Property

	@Autowired // field Injection
	private LocalDate ld; // HAS-A-Property

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-param Constructor");
	}

	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage():: " + lt + "  " + ld);

		int hour = lt.getHour();
		if (hour < 12)
			return " Good Morning " + user;

		else if (hour < 16)
			return " Good Afternoon " + user;

		else if (hour < 20)
			return " Good Evening " + user;

		else
			return " Good Night " + user;
	}

}
