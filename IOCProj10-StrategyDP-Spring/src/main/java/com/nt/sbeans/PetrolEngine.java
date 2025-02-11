package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public class PetrolEngine implements Engine {

	@Override
	public void startEngine() {
		System.out.println("PetrolEngine :: Petrol Engine Started ");

	}

	@Override
	public void stopEngine() {
		System.out.println("PetrolEngine :: Petrol Engine Stopped ");

	}

}
