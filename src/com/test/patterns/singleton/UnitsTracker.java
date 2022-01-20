package com.test.patterns.singleton;

public class UnitsTracker {
	
	private static UnitsTracker INSTANCE;
	
	private int unitsSold = 0;
	
	private UnitsTracker() {
		
	}
	
	public static UnitsTracker getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new UnitsTracker();
		}
		return INSTANCE;
	}
	
	public void addUnitSold(int units) {
		unitsSold += units;
	}
	
	public int totalUnitsSold() {
		return unitsSold;
	}

}
