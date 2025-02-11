package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Vehicle;

public class StrategyDpTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Vehicle vehicle = ctx.getBean("vehicle", Vehicle.class);

		vehicle.journay("Hyderabad", "Goa");
		
		vehicle.journay("Hyderabad", "Kanpur");

		ctx.close();
	}

}
