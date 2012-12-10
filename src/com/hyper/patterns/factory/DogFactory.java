package com.hyper.patterns.factory;

//The Java Factory class

public class DogFactory {
	public static DogAbstract getDog(String criteria) //devuelve DogAstract!
	  {
	    if ( criteria.equals("small") )
	      return new ConcretePoodleClass();
	    else if ( criteria.equals("big") )
	      return new ConcreteRottweilerClass();
	     

	    return null;
	  }
}
