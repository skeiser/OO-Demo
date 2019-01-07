package com.steve.apps;

import com.steve.inheritance.DieselTruck;
import com.steve.interfaces.SafetyInspectable;

public class SafetyInspector {

	public static void main(String[] args) {
		SafetyInspectable si = new DieselTruck();
		
		si.runBrakeTest();
		si.runHornTest();
		si.runLightTest();
	}

}
