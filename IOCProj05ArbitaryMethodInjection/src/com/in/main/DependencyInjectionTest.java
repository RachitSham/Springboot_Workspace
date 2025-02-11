package com.in.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		
		System.out.println("DependencyInjectionTest.main() Start()");
		
		// creating the IOC Container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/config/applicationContext.xml");
		
		// get target spring bean class object ref from the IOC container
		Object obj = ctx.getBean("wmg");
		
		// type casting
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		
		String result = generator.generateWishMessage("Welcome to Springboot course by Natraj Sir !! ");
		System.out.println(result);
		
        // close the IOC Container
		ctx.close();
		
		System.out.println("DependencyInjectionTest.main() End Of the Program()");
	}
}
