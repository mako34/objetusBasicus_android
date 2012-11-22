package com.hyper.patterns;

import java.util.Observable;

import android.util.Log;

//the observer

public class Observer implements java.util.Observer {

	@Override
	public void update(Observable observable, Object data) {
		// TODO Auto-generated method stub
		
		if (observable instanceof Observable) {
		
			Log.d("mensaje", "respondo mijo");

			
		}
		
		Log.d("mensaje", "respondo sde");

	}
	
	
	public void estamos () {
		Log.d("mensaje", "despertao observer");
	}



}
