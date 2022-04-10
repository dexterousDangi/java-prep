package com.Inheritance;

public class Child extends Parent {

	/* this code is generated by compiler
	Child() {
		super();
		}
*/	
	static {
		System.out.println("child class static block");
	}
	{
		System.out.println("child class instance block");
	}
	public static void main(String[] args) {

		new Child();
	}

}

/*output:
parent class static block
child class static block
parent class instance block
parent class constructor
constructor executed without using super() keyword by user
child class instance block
*/