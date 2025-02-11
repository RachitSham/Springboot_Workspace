package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator { // Target Spring Bean

	// HAS-A-Property
	@Autowired   // field Injection
	private LocalTime lt;
	
	// HAS-A-Property
	@Autowired      // field Injection 
	private LocalDate ld;

	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage():: " + lt + "...." + ld);

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
