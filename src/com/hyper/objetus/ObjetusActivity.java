package com.hyper.objetus;

import java.util.Observable;
import java.util.Observer;

import com.hyper.patterns.decorator.Beverage;
import com.hyper.patterns.decorator.HouseBlend;
import com.hyper.patterns.decorator.Mocha;
import com.hyper.patterns.decorator.Whip;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

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
	
	private com.hyper.patterns.Observable observableObj = new com.hyper.patterns.Observable();
	private com.hyper.patterns.Observer observerObj = new com.hyper.patterns.Observer();
	
	
	
	@Override //Override-Annotation is just a hint for the compiler that you want to overwrite a certain function
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        observableObj.addObserver(observerObj); //notification en observer
        observerObj.estamos();
        
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
        
        
      //button techniqu 1 instanciao a mano
    	final Button boton = (Button) findViewById(R.id.button1);
   
    	boton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
 				Log.d("mensaje", "clickAtento notify1");

			 	//send notification
				observableObj.notificaMisPerras();
				
 			}
		});

     
   
    	//el decorator!
    	
    	Beverage beverage = new HouseBlend();
		Log.d("mensaje", "tu beverage:"+beverage.getDescription()+"$"+beverage.cost());

		beverage = new Mocha(beverage); //wrap it with a 
		beverage = new Mocha(beverage); //wrap the sob again
		beverage = new Whip(beverage);
		Log.d("mensaje", "tu beverage preparada:"+beverage.getDescription()+"$"+beverage.cost());

		
    	
    	
    	
  
    	
    }

	
	
	
	//metodo 2 por xml, el xml lo instancia
	//nota q esta fuera del onCreate!
	public void atentoTuClick (View view) {
		Log.d("mensaje", "clickAtento notify2");
		
		
	}

	
	//decorator
 
	
}