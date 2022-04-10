package com.Inheritance;

public class Parent {
	Parent() {
		System.out.println("parent class constructor");
		System.out.println("constructor executed without using super() keyword by user");
	}
// instance block
	{
		System.out.println("parent class instance block");
	}
//static block
	static {
		System.out.println("parent class static block");
	}

}
