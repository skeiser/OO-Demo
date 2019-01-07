package com.steve.inheritance;

import com.steve.utils.FuelType;

public class DieselTruck extends Truck {
	
	public DieselTruck() {
		this.vehicleName = "Diesel Truck";
		this.fuelTypeRequired = FuelType.DIESEL;
		this.fuelTypeAllowed = FuelType.DIESEL;
		this.numberOfCylinders = 8;
		this.engineSizeLiters = 6.0;
		this.fuelInTank = FuelType.DIESEL;
	}

	public void measureEmissions() {
		System.out.println(vehicleName + " ");
		if(!engineRunning)
			startEngine();
		System.out.println(vehicleName + " PPM(Max) - " + (engineSizeLiters*numberOfCylinders));
		System.out.println(vehicleName + " Emission Test Completed successfully");
	}

	@Override
	public void startEngine() {
		System.out.println(vehicleName +" Turning key to on, turning starter motor");
		if(this.fuelInTank!=this.fuelTypeRequired) {
			System.out.println(vehicleName +" Fuel type doesn't equal fuel in tank, serious engine damage as occurred!!");
			System.out.println(vehicleName +" Please call a tow truck and a mechanic and empty your wallet");
		}
		else {
			System.out.println(vehicleName +" Engine started");
		}
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		
	}

	public void runHornTest() {
		System.out.println(vehicleName + " Big massive, low sounding blast of a horn"); 
	}

}
