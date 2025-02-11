package com.nt.comps;

public class ElectricCars implements Cars {

	@Override
	public void drive() {
		System.out.println("ElectricCars.drive() :: Driving Electric Car (Mahindra XEV 9e) ");
		
	}

	@Override
	public void color() {
		System.out.println("ElectricCars.color() :: Mahindra XEV 9e (Gold Dawn)");
	}

}
