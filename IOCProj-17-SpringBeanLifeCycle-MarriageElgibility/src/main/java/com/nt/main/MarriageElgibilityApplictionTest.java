package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.sbeans.CheckingMarriageElgibility;

import AppConfig.AppConfig;

public class MarriageElgibilityApplictionTest {

	public static void main(String[] args) {

		// Create IOC Container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		// get Target spring bean class Object ref
		CheckingMarriageElgibility marriage = ctx.getBean("marriage", CheckingMarriageElgibility.class);

		// Invoke the b.method

		try {
			String result = marriage.ckeckElgibility();
			System.out.println(result);
		} catch (Exception e) {
	
		}

		// Close the container
		ctx.close();

	}

}
