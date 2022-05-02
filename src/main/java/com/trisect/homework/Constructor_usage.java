package com.trisect.homework;

public class Constructor_usage {
String name;
int age;
Constructor_usage() {
	
}
Constructor_usage(String name, int age) {
	this.name=name;
	this.age=age;
}
Constructor_usage(String name) {
	this.name=name;
}
		public static void main(String[] args) {
			
			Constructor_usage c1= new Constructor_usage("Messi",26);
			Constructor_usage c2 =new Constructor_usage("max");
			Constructor_usage c3 = new Constructor_usage();
			c3.name="Antonio";
			c3.age=c1.age;
			System.out.println("Name =" + c3.name + "," + "Age = " + c3.age);
			System.out.println("Name = " + c2.name +","+ "age = " + c2.age);
	}

}
