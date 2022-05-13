package com.trisect.homework;

public class J7A1 {
	int count1 = 0;
	static int count2 = 0;
	final int a = 8;

	J7A1() {
		count1 = count1 + 1;
		count2 = count2 + 1;

		System.out.print("Count1: " + count1);
		System.out.println(" Count2: " + count2);
	}

	public static void main(String[] args) {

		J7A1 student1 = new J7A1();
		J7A1 student2 = new J7A1();
		J7A1 student3 = new J7A1(); 
		//student1.a = 98;
	}

}

class Factory {
	final String location;
	int capacity;

	Factory(String loc, int cap) {
		location = loc;
		capacity = cap;
		System.out.println("Inside " + location + " factory");
	}

	public static void main(String[] args) {
		Factory factory1 = new Factory("Delhi", 2000);
		Factory factory2 = new Factory("Greater Noida", 1000);

		Factory factory3 = new Factory("Gurgaon", 1500);
		
		factory3.capacity = factory3.capacity * 2;
		System.out.println(factory3.location);
		System.out.println(factory3.capacity);
		//factory3.location = "Gurugram";
		System.out.println(factory3.location);
		System.out.println(factory3.capacity);
	}
}