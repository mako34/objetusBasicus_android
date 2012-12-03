package com.hyper.patterns.decorator;

public class HouseBlend extends Beverage{

	
	public HouseBlend () {
		description = "House blend coffee";
	}
	
	@Override //buscar q significa este macro!
	
	public double cost() {
		// TODO Auto-generated method stub
		return .89;
	}

}
