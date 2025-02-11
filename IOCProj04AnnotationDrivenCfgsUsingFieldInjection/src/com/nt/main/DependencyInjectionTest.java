package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {

		System.out.println("DependencyInjectionTest.main() Start() 	");

		// create the IOC container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		// get target spring bean class object ref from the IOC container
		Object obj = ctx.getBean("wmg");
		
		// type casting
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		
		String result = generator.generateWishMessage("Welcome To Springboot ");
		System.out.println(result);
		
        // close the IOC Container		
		ctx.close();
		
		System.out.println("DependencyInjectionTest.main() (End)");
	}

}
