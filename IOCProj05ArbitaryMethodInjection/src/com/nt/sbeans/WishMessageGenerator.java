package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	private LocalTime lt; // Has-A-Property

	private LocalDate ld; // Has-A-Property

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-Param Constructor");
	}

	// Arbitrary Methods similar to setter methods
	@Autowired
	public void assign(LocalTime lt) {
		System.out.println("WishMessageGenerator.assign()");

		this.lt = lt;
	}

	// Arbitrary Methods similar to setter methods
	@Autowired
	public void push(LocalDate ld) {
		System.out.println("WishMessageGenerator.push()");

		this.ld = ld;
	}

	public String generateWishMessage(String user) {

		System.out.println("WishMessageGenerator.generateWishMessage()");

		int hour = lt.getHour();

		if (hour < 12)
			return "Good Morning: " + user;

		else if (hour < 16)
			return "Good Afternoon: " + user;

		else if (hour < 20)
			return "Good Evening: " + user;

		else
			return "Good Night: " + user;
	}

}
