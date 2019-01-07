package com.steve.polymorphism;

public class PolymorphismExample2 {

	public static void main(String[] args) {
		VehicleOverload v = new VehicleOverload();
		v.rollWindowDown();
		v.rollWindowDown(50, "Fred");
		v.rollWindowDown(27);
	}
}

class VehicleOverload {
	
	public void rollWindowDown() {
		System.out.println("Window is all the way down");
	}
	public void rollWindowDown(int percent) {
		System.out.println("Window is "+percent+"% down");
	}
	public void rollWindowDown(int percent, String name) {
		System.out.println("Window is "+percent+"% down, " + name);
	}
}
