package com.demo;

public class Static_block_of_classes {

	static {
		System.out.println("current class static block");
	}

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.demo.B");
		Class.forName("com.demo.A");

	}

}
