package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("marriage")
@PropertySource("com/nt/commons/Info.properties")
public class CheckingMarriageElgibility {

	@Value("${marriage.id}")
	private Integer id;

	@Value("${marriage.name}")
	private String name;

	@Value("${marriage.age}")
	private Integer age;

	private Date verifiedOn;

	public CheckingMarriageElgibility() {
		System.out.println("CheckingMarriageElgibility.CheckingMarriageElgibility()");
	}

	@PostConstruct // Init Life Cycle Method
	public void myInit() {
		System.out.println("CheckingMarriageElgibility.myInit()");

		// Initialize the left over properties that had not participated in the
		// injections
		verifiedOn = new Date();

		// Validation logics

		if (name == null || age <= 0) {
			throw new IllegalArgumentException("set correct values to name, age and property for marriage");
		}
	}

	// b.method\

	public String ckeckElgibility() {
		System.out.println("CheckingMarriageElgibility.ckeckElgibility()");

		if (age <= 18)
			return "Mr./Miss/Mrs." + name + " You Are Not Elgibile For Marriage----->verified on::" + verifiedOn;
		else
			return "Mr./Miss/Mrs." + name + " You Are Elgibile For Marriage----->verified on::" + verifiedOn;

	}

	@PreDestroy
	public void myDestroy() {
		name = null;
		age = null;
		verifiedOn = null;
		id = null;
	}

}
