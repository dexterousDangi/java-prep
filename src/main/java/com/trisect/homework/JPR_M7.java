package com.trisect.homework;

//Recursion Basic:

public class JPR_M7 {

	public void printHi(int n) {
		if(n<1) {
			return;
		}System.out.println(" hola "+n);
		printHi(n-1);
		System.out.println();
		System.out.println(" hola "+n);
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
		int sum3=0;
	public void sumofFirstN(int n) {
		if(n<1) {
			return;
		}
		sum3=sum3+n;
		System.out.print(sum3+" >>");
		sumofFirstN(n-1);
		
	}
	
	int sum4=0;
	public int squareSum(int n) {
		if(n<1) {
			return sum4;
		}
		sum4=sum4+(n*n);
		return squareSum(n-1);
	}
	
	int out5=1;
	public int whatpowerof2(int n) {
		if(n<1) {
			System.out.println();
			return out5;
			
		}
		out5=out5*2;
		return whatpowerof2(n-1);
	}
	
	int poweradd=1;
	public void nthPowerOfM(int m,int n) {
		if(n<1) {
			System.out.println(poweradd);
			System.out.println();
			return;
		}poweradd=poweradd*m;
		nthPowerOfM(m,n-1);
	}
	
	private int countD(String str7) {
		int len=str7.length();
		if(len==0) {
			return 0;
		}
		int digit=0;
		char ch=str7.charAt(0);
		if(ch=='d') {
			digit=1;
		}
		return digit+countD(str7.substring(1));
	}

	
	public static void main(String[] args) {
		
		JPR_M7 object= new JPR_M7();
		
		// Example no.1 or task 1 and task 2
		object.printHi(4);
		System.out.println();
		
		//Example no.2
		object.fact(5);
		System.out.println();
		
		//task3
		object.sumofFirstN(4);
		System.out.println();
		
		//task4
		System.out.println("sum of square of first "+" number : "+object.squareSum(5));
		
		//task5
		System.out.println("power of 2 : "+object.whatpowerof2(8));
		
		//task6
		object.nthPowerOfM(5, 04);
		
		//Example7
		String str7="pardeepddangi";
		System.out.println(object.countD(str7));

	
	}
	
}
