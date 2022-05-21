package com.trisect.homework;

//Recursion Basic:

public class JPR_M7 {

	public void printHi(int n) {
		if(n<1) {
			return;
		}System.out.print(" hola ");
		printHi(n-1);
	}
	
		int add= 1;
	public void fact (int n) {
		if (n<=1){
		System.out.print( n+" = "+add);
		return;
		}System.out.print(n+"*");
		add=add*(n);
		fact(n-1);
		
	}
	
	public static void main(String[] args) {
		
		JPR_M7 object= new JPR_M7();
		
		// Example no.1
		object.printHi(4);
		System.out.println();
		
		//Example no.2
	 object.fact(5);
		
	}

}
