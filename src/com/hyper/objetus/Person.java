package com.hyper.objetus;

import android.util.Log;

public class Person {

	public String nombre;
	
	//metodos
	//con return
	public String dimeTuNombre() {
		Log.d("mensaje","el nombre logeado ::"+nombre);
		return nombre;
	}
	

	public String queLida(String nenaNombre) {
		
		Log.d("mensaje", "quilinda llaa");
		
		//return "tu:"+nenaNombre+" ... y yo:"+nombre;
		return nenaNombre;
	}

 
	public void listoListo(){
		Log.d("mensaje", "listo listo");

	}
	
	
}
