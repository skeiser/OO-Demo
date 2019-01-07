package com.steve.apps;

import com.steve.inheritance.DieselTruck;
import com.steve.inheritance.Truck;
import com.steve.utils.FuelType;

public class TruckDriver {

	public static void main(String[] args) {
		
		Truck t = new DieselTruck();
		t.fuelTypeAllowed = FuelType.GAS;
		t.getFuel(FuelType.GAS);
		t.startEngine();
	}

}
