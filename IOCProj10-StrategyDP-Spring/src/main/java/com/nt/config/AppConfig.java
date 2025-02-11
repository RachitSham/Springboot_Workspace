package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nt.sbeans.Engine;
import com.nt.sbeans.PetrolEngine;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
public class AppConfig {

	@Bean
	public Engine createEngine() {
		return new PetrolEngine();

	}

}
