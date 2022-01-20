package com.test.patterns;

import com.test.patterns.factory.Plan;
import com.test.patterns.factory.PlanFactory;
import com.test.patterns.singleton.UnitsTracker;

public class BillingMainClass {

	public static void main(String[] args) {
		int noOfUnits = 10;
		double basePrice = 100;
		
		UnitsTracker unitsTrackerObj = UnitsTracker.getInstance();
		
		
		Plan studentPlan = PlanFactory.getPlan("STUDENT");
		double priceForStudent = studentPlan.calculatePrice(noOfUnits, basePrice);
		System.out.println("Price for Student = " + priceForStudent);
		System.out.println("No Of Unit Sold = " + unitsTrackerObj.totalUnitsSold());
		
		
		Plan staffPlan = PlanFactory.getPlan("STAFF");
		double priceForStaff = staffPlan.calculatePrice(noOfUnits, basePrice);
		System.out.println("Price for Staff = " + priceForStaff);
		System.out.println("No Of Unit Sold = " + unitsTrackerObj.totalUnitsSold());
		

	}

}
