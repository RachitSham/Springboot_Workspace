package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public final class Vehicle {

	private Engine engine; // HAS-A-Property

	@Autowired
	@Qualifier("pEngine")
	public void start(Engine engine) {
		this.engine = engine;

	}

	@Autowired
	@Qualifier("pEngine")
	public void stopped(Engine engine) {
		this.engine = engine;
	}

	public void journay(String startingJournay, String endingJournay) {
		System.out.println("Journay Started From " + startingJournay + " to " + endingJournay);
		engine.startEngine();

		engine.stopEngine();
		System.out.println("Journey Completed ");
		
		System.out.println(" ---------------------------------------- ");
	}
}
