package com.hyper.patterns.factory;

import android.util.Log;

//concrete Dog classes

public class ConcreteRottweilerClass implements DogAbstract{

	
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		Log.d("mensaje", "soy un Rotweiller baby,  tomalo suave");

	}

}
