package com.steve.polymorphism;

public class PolymorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v = new Vehicle();
		v.revMotor();
		
		v = new Motorcycle();
		v.revMotor();

	}

}

class Vehicle {

	public void revMotor() {
		System.out.println("Basic plain motor revving sound");
	}
}

class Motorcycle extends Vehicle {
	
	@Override
	public void revMotor() {
		System.out.println("Pretty cool sound of a horizontally opposed twin cylinder - Brapp!!!!");
	}
}
