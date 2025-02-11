package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.CheckingVotingElgibility;

public class SpringBeanLifeCycleTest {

	public static void main(String[] args) {

		// creating the Ioc Container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		// get target spring bean class Obj ref
		CheckingVotingElgibility voter = ctx.getBean("voter", CheckingVotingElgibility.class);

		// Invoke b.method
		try {
			String result = voter.ckeckElgibility();
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
		}

		// close the container
		ctx.close();
	}

}
