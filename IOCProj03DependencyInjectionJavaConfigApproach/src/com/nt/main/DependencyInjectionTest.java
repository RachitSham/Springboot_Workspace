package com.nt.main;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);

		// invoke b.method
		String msg = generator.generateWishMessage(" Welcome to Dependency Injection java Configuration approach ");
		System.out.println(msg);

		System.out.println(" *********************************************** ");
		LocalDate date = ctx.getBean("ldate", LocalDate.class);
		LocalTime time = ctx.getBean("ltime", LocalTime.class);

		System.out.println(time + " " + date);

		// close the IOC container
		ctx.close();

	}

}
