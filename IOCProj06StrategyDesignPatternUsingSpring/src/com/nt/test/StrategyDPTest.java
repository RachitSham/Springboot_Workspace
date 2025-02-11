package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Myntra;

public class StrategyDPTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		// get the target spring bean class object
		Myntra myn = ctx.getBean("myn", Myntra.class);

		// invoke the b.method
		String resultMsg = myn.shopping(new String[] { "Shirt", "Trouser" }, new double[] { 90000.0, 50000.0 });

		System.out.println(resultMsg);

		// close the container
		ctx.close();
	}

}
