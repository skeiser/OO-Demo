package com.steve.apps;

import com.steve.inheritance.Motorcycle;
import com.steve.utils.FuelType;

public class MotorcycleRider {

	public static void main(String[] args) {
		Motorcycle m = new Motorcycle();
		m.doMaintenance(FuelType.GAS);
	}

}
