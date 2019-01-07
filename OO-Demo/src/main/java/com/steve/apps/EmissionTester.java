package com.steve.apps;



import com.steve.inheritance.DieselTruck;
import com.steve.interfaces.EmissionTestable;

public class EmissionTester {

	public static void main(String[] args) {
		EmissionTestable f350 = new DieselTruck();
		f350.measureEmissions();
	}

}
