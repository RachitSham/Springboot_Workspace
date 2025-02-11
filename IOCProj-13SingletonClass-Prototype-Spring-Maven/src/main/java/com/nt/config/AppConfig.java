package com.nt.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.nt.sbeans")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig. start()");
	}

	@Bean("dt")
	@Scope("prototype")
	public LocalDateTime createltd() {
		System.out.println("AppConfig.createltd()");
		return LocalDateTime.now();
	}

	@Bean("dt1")
	@Scope("prototype")
	public LocalDateTime createltd1() {
		System.out.println("AppConfig.createltd1()");
		return LocalDateTime.now();
	}
}
