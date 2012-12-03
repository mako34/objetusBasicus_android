package com.hyper.patterns.decorator;

public class Whip extends CondimentDecorator{

	Beverage beverage;
	
	public Whip (Beverage beverage){ //mira el color!! son diferentes!, ohh!
		this.beverage = beverage; //a que kiko
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .10 + beverage.cost();
	}

}
