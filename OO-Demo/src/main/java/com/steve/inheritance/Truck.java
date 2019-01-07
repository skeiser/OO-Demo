package com.steve.inheritance;

import com.steve.interfaces.EmissionTestable;
import com.steve.interfaces.SafetyInspectable;
import com.steve.utils.FuelType;

public abstract class Truck extends MotorizedVehicle implements SafetyInspectable, EmissionTestable {
	
	@Override
	public void reverse() {
		System.out.println(vehicleName +" Shifting Transmission to Reverse and backing up");
	}

	@Override
	public void getFuel(int fuelType) {
		System.out.println(vehicleName +" Pulling to " + FuelType.fuelAsString(fuelType) + " pump and filling with " + FuelType.fuelAsString(fuelType));
		System.out.println(vehicleName +" Fuel Tank is filled with " + FuelType.fuelAsString(fuelType));
		this.fuelInTank = fuelType;
	}

	public void runLightTest() {
		System.out.println(vehicleName +" flashing lights from turn signal lever");
	}

	public void runBrakeTest() {
		System.out.println(vehicleName +" Pressing brake pedal");
	}
}
