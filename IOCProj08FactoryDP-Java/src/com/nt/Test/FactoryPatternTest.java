package com.nt.Test;

import com.nt.comps.Bike;
import com.nt.factory.BikeFactory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		Bike bike = BikeFactory.orderBike("Standard");
		bike.drive();
		System.out.println("FactoryPatternTest.main()");
		
		Bike bike1 = BikeFactory.orderBike("Sports");
		bike1.drive();
		System.out.println("FactoryPatternTest.main()");
		
		
		Bike bike2 = BikeFactory.orderBike("Bullet");
		bike2.drive();
		System.out.println("FactoryPatternTest.main()");
		
		Bike bike3 = BikeFactory.orderBike("Electric");
		bike3.drive();
		System.out.println("FactoryPatternTest.main()");
	}
}
