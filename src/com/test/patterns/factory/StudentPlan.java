package com.test.patterns.factory;

public class StudentPlan extends Plan {

	@Override
	public double getDiscountPercentage() {
		return (double) 5/100;
	}

}
