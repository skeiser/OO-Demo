package com.steve.abstraction;

public class CarDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car r = new Car();
		r.start();
		r.go();
	}

}

class Car {
	
	public void start() {
		turnOnIgnition();
		turnOnFuelPump();
		crankStarterMotor();
	}
	
	public void go() {
		switchTransmissionToGo();
		pressAccelerator();
		watchForOtherCars();
	}
	
	private void turnOnIgnition() {
		
	}
	private void turnOnFuelPump() {
		
	}
	private void crankStarterMotor() {
		
	}
	
	private void switchTransmissionToGo() {
		
	}
	private void pressAccelerator() {
		
	}
	private void watchForOtherCars() {
		
	}
	
}
