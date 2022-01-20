package com.test.patterns.factory;

import com.test.patterns.singleton.UnitsTracker;

public abstract class Plan {
	
	
	public double calculatePrice(int units, double price) {
		UnitsTracker.getInstance().addUnitSold(units);
		double total = units*price;
		double discount = total*getDiscountPercentage();
		return total-discount;
	}
	
	public abstract double getDiscountPercentage();
}
