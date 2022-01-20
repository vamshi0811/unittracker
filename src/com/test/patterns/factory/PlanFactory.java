package com.test.patterns.factory;

public class PlanFactory {
	
	public static Plan getPlan(String planName) {
		if("STUDENT".equals(planName)) {
			return new StudentPlan();
		}
		if("STAFF".equals(planName)) {
			return new StaffPlan();
		}
		return null;
	}

}
