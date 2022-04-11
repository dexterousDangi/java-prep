package com.Inheritance;

public class SubClass extends SuperClass {

	void listTask() {
		System.out.println("add all the tasks");
	}

	void completedTask() {
		System.out.println("completed the tasks");
	}

	public static void main(String[] args) {

		// child class object can be stored in the reference of parent class
		SuperClass sc = new SubClass();

		System.out.println(sc.getClass());
		System.out.println(sc instanceof SubClass);
		System.out.println(sc instanceof SuperClass);
		sc.listTask();
		
		// but using the reference variable we can't call child class object
		// for the we have to perform type casting of reference variable into the
		// subclass type

		// sc.completedTask(); will create error

		SubClass sb = (SubClass) sc;
		sb.completedTask();

	}

}
