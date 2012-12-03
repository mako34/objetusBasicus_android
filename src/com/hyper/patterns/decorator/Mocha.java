package com.hyper.patterns.decorator;

public class Mocha  extends CondimentDecorator{

	Beverage beverage;
	
	public Mocha (Beverage beverage){ //mira el color!! son diferentes!, ohh!
		this.beverage = beverage; //a que kiko
	}
	
 	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Mocha";
	}

 	
 	public double cost() {
		// TODO Auto-generated method stubdd
		return .20 + beverage.cost();
	}

}
