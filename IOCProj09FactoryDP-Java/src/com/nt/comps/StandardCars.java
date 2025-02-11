package com.nt.comps;

public class StandardCars implements Cars{

	@Override
	public void drive() {
		System.out.println("StandardCars.drive() :: Driving Standard Cars (Mahindra XUV700)");
		
		
	}

	@Override
	public void color() {
		System.out.println("StandardCars.color :: Mahindra XUV700(Deep Forest)");		
	}

}
