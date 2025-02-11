package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("voter")
@PropertySource("com/nt/commons/Info.properties")
public class CheckingVotingElgibility {

	@Value("${voter.id}")
	private Integer id;

	@Value("${voter.name}")
	private String name;

	@Value("${voter.age}")
	private Integer age;

	private Date verifiedOn;

	@PostConstruct // Init life cycle method
	public void myInit() {
		System.out.println("CheckingVotingElgibility.myInit()");

		// Initialize the left over properties that had no participated in the
		// injections
		verifiedOn = new Date();

		// validation logics

		if (name == null || age <= 0) {
			throw new IllegalArgumentException("set correct values to name, age and property");
		}
	}

	// b.method\

	public String ckeckElgibility() {
		System.out.println("CheckingVotingElgibility.ckeckElgibility()");

		if (age < 18)
			return "Mr./Miss/Mrs." + name + " You Are Not Elgibile For Voting----->verified on::" + verifiedOn;
		else
			return "Mr./Miss/Mrs." + name + " You Are Elgibile For Voting----->verified on::" + verifiedOn;

	}
	
	@PreDestroy  // Destroy Life Cycle Method
	public void myDestroy() {
		System.out.println("CheckingVotingElgibility.myDestroy()");
		
		name = null;
		age = null;
		verifiedOn = null;
		id = null;
	}
}
