package com.hyper.patterns;

import android.util.Log;

 
public class Observable extends java.util.Observable {

	
 public void notificaMisPerras ()
 {
	 Log.d("mensaje", "llamando perras");
	 setChanged();
	 notifyObservers();
 }
	
}
