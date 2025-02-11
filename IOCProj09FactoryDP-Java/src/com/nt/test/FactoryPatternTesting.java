package com.nt.test;

import com.in.factory.CarsFactory;
import com.nt.comps.Cars;

public class FactoryPatternTesting {

	public static void main(String[] args) {
	
		Cars cars = CarsFactory.orderCar("Standard");
		cars.drive();
		cars.color();
		System.out.println("***********************************************");
		
		Cars cars1 = CarsFactory.orderCar("Sports");
		cars1.drive();
		cars1.color();
		System.out.println("***********************************************");
		
		Cars cars2 = CarsFactory.orderCar("Luxary");
		cars2.drive();
		cars2.color();
		System.out.println("***********************************************");
		
		Cars cars3 = CarsFactory.orderCar("Electric");
		cars3.drive();
		cars3.color();
		System.out.println("***********************************************");
	}
	

}
