package com.steve.inheritance;

import com.steve.utils.FuelType;

public abstract class MotorizedVehicle {
	protected String vehicleName;
	protected int numberOfCylinders;
	protected double engineSizeLiters;
	protected int fuelTypeRequired;
	public int fuelTypeAllowed;
	protected int fuelInTank;
	protected int numberOfWheels;
	protected boolean engineRunning;
	
	public abstract void stop();
	public abstract void stopEngine();
	public abstract void getFuel(int fuelType);
	
	public void startEngine() {
		System.out.println(vehicleName + " turning key, engine running");
	}
	
	
	public void drive() {
		System.out.println(vehicleName + " moving gearshift to D, moving forward");

	}

	
	public void reverse() {
		System.out.println(vehicleName + " moving gearshift lever to R, moving backward");

	}

	
	public void park() {
		System.out.println(vehicleName + " moving gearshift lever to P, Parked");

	}
	
	public void doMaintenance(int f) {
		System.out.println(vehicleName + " Pull out your hammer and give it a big smack. You're good to go");
		
	}
}
