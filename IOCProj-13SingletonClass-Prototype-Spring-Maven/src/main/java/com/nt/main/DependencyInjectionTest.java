package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		
		// creating the IOC container 
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		// get target spring bean class object 
		
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator generator1 = ctx.getBean("wmg", WishMessageGenerator.class);
		WishMessageGenerator generator2 = ctx.getBean("wmg", WishMessageGenerator.class);
		
		System.out.println(generator.hashCode()+ " " + generator1.hashCode()+ " " + generator2.hashCode()); // gives the different hashcode
		System.out.println("generator==generator1?" + (generator==generator1)); // give false
		System.out.println("generator1==generator2?"+ (generator1==generator2)); // give false
	}

}
