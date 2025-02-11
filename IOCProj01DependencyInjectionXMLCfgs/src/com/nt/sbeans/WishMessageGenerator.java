package com.nt.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator { // Target Spring Bean

	// HAS-A-Property
	private LocalTime lt;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0 Param Constructor ");
	}

	// Setter method for setter injection
	public void setLt(LocalTime lt) {
		this.lt = lt;
	}

	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");

		// Get Current Hour of the day
		int hour = lt.getHour();  // In 24Hours Format
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
