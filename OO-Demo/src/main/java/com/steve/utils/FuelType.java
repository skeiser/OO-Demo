package com.steve.utils;

public class FuelType {
	public static final int DIESEL = 0;
	public static final int GAS = 1;
	public static final int ELECTRIC = 2;
	public static final int SOLAR = 3;
	public static final int OTHER = 4;
	
	public static String fuelAsString(int fuelType) {
		switch (fuelType) {
		case DIESEL:
			return "Diesel";
		case GAS:
			return "Gas";
		case ELECTRIC:
			return "Electric";
		case SOLAR:
			return "Solar";
		default:
			return "I'm not sure what to do with this fuel. You're on your own";			
		}
	}
}
