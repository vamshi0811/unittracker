package com.test.patterns.factory;

public class StaffPlan extends Plan {

	@Override
	public double getDiscountPercentage() {
		return (double) 10/100;
	}

}
