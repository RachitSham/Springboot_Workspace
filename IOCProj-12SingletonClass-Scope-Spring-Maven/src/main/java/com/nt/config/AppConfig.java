package com.nt.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig :: 0 Param Constructor");
	}

	@Bean("dt")
	@Scope("singleton")
	public LocalDateTime createLTD() {
		System.out.println("AppConfig.createLTD()");
		return LocalDateTime.now();
	}

	@Bean("dt1")
	@Scope("singleton")
	public LocalDateTime createLDT1() {
		System.out.println("AppConfig.createLDT1()");
		return LocalDateTime.now();
	}
}
