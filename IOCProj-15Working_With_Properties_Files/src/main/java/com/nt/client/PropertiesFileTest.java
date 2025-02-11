package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.config.AppConfig;
import com.nt.sbeans.PersonInfo;

public class PropertiesFileTest {

	public static void main(String[] args) {
		
		// Create the IOC container
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// Spring bean class Object reference
		
		PersonInfo info = ctx.getBean("pInfo",PersonInfo.class);
		System.out.println(info);
		
		// get access to Environment object 
		Environment env = ctx.getEnvironment();
		System.out.println("os.name :: " + env.getProperty("os.name"));
	}

}
