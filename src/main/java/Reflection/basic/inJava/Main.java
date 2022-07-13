package Reflection.basic.inJava;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

// reflection machnisam allows us to get the information about a class like how many variable , methods,constructors and block that it contains during run time
// while using some libraries during project we want to get information about the class then use this machanism . present in java.lang.reflect package:

public class Main {

	public static void main(String[] args) {
		
		Class<Dog> c =Dog.class;   //will give us dog class fully qualified name
		System.out.println(c.getName());
		
		Class[] interfaces= c.getInterfaces();
		System.out.println(interfaces.length);
		
//		 for(Class a:interfaces)
//			 System.out.println("+"+a);
		
		 Class classSuper= c.getSuperclass();   // will give us the parent class of dog class
	        System.out.println(classSuper.getName());  
		 
		int classModifier= c.getModifiers();
		System.out.println(Modifier.isPublic(classModifier)); //  will give the true if modifier of the class is public
		  // can also check isAbsrtact, isFinal, isInterface, isPrivate, isProtected, isStatic, isStrict, isSynchronized, isVolatile
		 
		 
		 Method [] classMethod= c.getMethods();  // will give us the all the method in the dog class with in the arrays
		 for(Method a:classMethod) {
			 System.out.println(a.getName());   // WILL GIVE US THE METHOD NAMES OF THE PARENT CLASS TOO
		 }
		 Object o= c.getClass();
		 System.out.println(o);
		 
	}

}
