package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngine")
public class ElectricEngine implements Engine{

	@Override
	public void startEngine() {
		System.out.println("ElectricEngine :: Electric Engine Started)");		
	}

	@Override
	public void stopEngine() {
		System.out.println("ElectricEngine :: Electric Engine Stopped)");		
		
	}

}
