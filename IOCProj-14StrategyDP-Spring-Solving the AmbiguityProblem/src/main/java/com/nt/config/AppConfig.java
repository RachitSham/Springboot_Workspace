package com.nt.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.nt.comps")
//@PropertySource("com/nt/commons/myfile.properties")
@ImportResource("com/nt/cfgs/applicationContext.xml")

public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig.AppConfig()");
	}
}
