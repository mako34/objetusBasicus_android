package com.hyper.objetus;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class ObjetusActivity extends Activity { // que quiere decir esta linea?
    /** Called when the activity is first created. */
   
	//instance variables!!
	
	//any child
	//diferenceia string con S y con s?
	public String miInstancePublicStringVar; //android.R
	public String javaVar; //java.lang
	

	
 // si la cambio en un aclase las otras clases la veran?

	
	//visible en esta clase solamente
	private String myInstancePrivateStringVar;  //es esto como una propiedad en obj C?, osea para cambiar?
	
	//static!, constante,
	private static double salary;
	
	public static double incomes;
	
	/*
	//por cualquier child
	public String myInstanceConstructorVar;
	
	//instance var asignada en constructor
	//parecido con ios custom initializer?
	// q pasa si no le doy ningun valor? se crashea pues no le estoy dando lo q espera para empezar
	//ponerlo a crear con esto
	public ObjetusActivity (String nombre) {
		myInstanceConstructorVar = nombre;
	}
 	*/
	
	
	
	@Override //Override-Annotation is just a hint for the compiler that you want to overwrite a certain function
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //testeo variables LOCALES
        int edad = 0;
        edad = edad + 7;
        Log.d("mensaje", "tu edad ::"+edad);
        
        //log las 2 strings,
        miInstancePublicStringVar = "tingo";
        javaVar = "dd";
        
        Log.d("mensaje", "string 1 :"+miInstancePublicStringVar+"\nmi string 2 :"+javaVar);
        
        Log.d("mensaje", "android.R == "+miInstancePublicStringVar);
        

        //instantiating my method
        Person persona1 = new Person();
        persona1.nombre = "pingus";
        persona1.dimeTuNombre();
         
        Log.d("mensaje", "tu mensaje de quilinda"+persona1.queLida(" mikyaky"));
        
        persona1.listoListo();
    }

}