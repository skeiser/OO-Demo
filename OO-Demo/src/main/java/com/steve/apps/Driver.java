package com.steve.apps;

import com.steve.inheritance.DieselTruck;
import com.steve.inheritance.MotorizedVehicle;

public class Driver {

	public static void main(String[] args) {
		MotorizedVehicle dieselTruck = new DieselTruck();
		dieselTruck.startEngine();
		dieselTruck.drive();
		dieselTruck.stop();
		dieselTruck.reverse();
		dieselTruck.stop();
		dieselTruck.stopEngine();
	}

}
