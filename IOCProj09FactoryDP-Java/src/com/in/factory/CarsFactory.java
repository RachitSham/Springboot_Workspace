package com.in.factory;

import com.nt.comps.Cars;
import com.nt.comps.ElectricCars;
import com.nt.comps.LuxaryCars;
import com.nt.comps.SportsCars;
import com.nt.comps.StandardCars;

public class CarsFactory {

	// static factory method having factory pattern logic
	public static Cars orderCar(String type) {
		Cars cars = null;
		
		if(type.equalsIgnoreCase("Standard"))
			cars = new StandardCars();
		
		else if(type.equalsIgnoreCase("Sports"))
			cars = new SportsCars();
		
		else if(type.equalsIgnoreCase("Luxary"))
			cars = new LuxaryCars();
		
		else if(type.equalsIgnoreCase("Electric"))
			cars = new ElectricCars();
		
		else
			throw new IllegalArgumentException("Invalid Bike Type !! ");
		return cars;
	}
}
