package com.nt.factory;

import com.nt.comps.Bike;
import com.nt.comps.BulletBike;
import com.nt.comps.ElectricBike;
import com.nt.comps.SportsBike;
import com.nt.comps.StandardsBike;

public class BikeFactory {

	// static factory method having factory pattern logic
	public static Bike orderBike(String type) {
		Bike bike = null;

		if (type.equalsIgnoreCase("Standard"))
			bike = new StandardsBike();

		else if (type.equalsIgnoreCase("Sports"))
			bike = new SportsBike();

		else if (type.equalsIgnoreCase("Bullet"))
			bike = new BulletBike();

		else if (type.equalsIgnoreCase("Electric"))
			bike = new ElectricBike();

		else
			throw new IllegalArgumentException("Invalid Bike Type !! ");
		return bike;

	}
}
