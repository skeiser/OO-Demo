package com.steve.inheritance;

public abstract class Car extends MotorizedVehicle {

		
	@Override
	public void stop() {
		System.out.println(vehicleName + " stepping on brake, stopped");
	}

	@Override
	public void stopEngine() {
		System.out.println(vehicleName + " turning key to off, engine off");
	}
}
