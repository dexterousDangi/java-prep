package Reflection.basic.inJava;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TeamMain {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			
		/**
		 * we will create the object of Team class here althought the team class constructor is private this 
		 * is only possible because of the reflection concept
		 */
		Class<?> c=Class.forName("Reflection.basic.inJava.Team");
		System.out.println(c);
		
		// getDeclaredConstructors() method gives us the all the contructor present in the corresponding class
		
		Constructor<?> [] constructor= c.getDeclaredConstructors();
		
		// to set the private constructor public we have to use a method setAccessible() and set it as true
		
		constructor[0].setAccessible(true);
		
		// now the constructor became public or say accessible, by using newInstance() method we can create a method now;
		
	     Object o =	constructor[0].newInstance();
	     Team t=(Team)o;
	     t.game();
	}

}
