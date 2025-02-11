package com.nt.comps;

public class SportsCars implements Cars {

	@Override
	public void drive() {
	 System.out.println("SportsCars.drive() :: Driving Sports Car ! (McLaren 720S)");
	 
	}

	@Override
	public void color() {
		System.out.println("SportsCars.color() :: McLaren 720S (Aurora Blue) ");
		
	}

}
