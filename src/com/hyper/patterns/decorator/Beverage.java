package com.hyper.patterns.decorator;

public abstract class Beverage { //abstract ojo
	String description = "unknown beve";
	
	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
