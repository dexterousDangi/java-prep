package com.trisect.homework;

public class JLAB_S {

	public int square(int n) {
		int squareN = n * n;
		//System.out.println( squareN);
		return squareN;
	}

	public int  cube(int n) {
		int cube = n * n * n;
		//System.out.println( cube);
		return cube;
	}

	public void sumSquareCube(int n) {
		JLAB_S obj= new JLAB_S();
		
		int sum= obj.square(n) + obj.cube(n);
		System.out.println(sum);
	}
	public void power4(int n) {
		JLAB_S obj= new JLAB_S();
		int four= obj.square(n)*obj.square(n);
		System.out.println("4th Power -"+n+"= "+four);
	}
	
	public void power5(int n) {
		JLAB_S obj= new JLAB_S();
		int five= obj.square(n)*obj.cube(n);
		System.out.println("5th power -"+n+"= "+five);
	}
	
	public void pattern1(int n) {
		String str="";
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
					str=str+"*";
			}
			str=str+i;
			System.out.println(str);
		}
	}
	
	public void patter2(String str) {
		int size=str.length();
		String st="";
		char ch;
		for(int i=size-1; i>=0;i--) {
			ch=str.charAt(i);
			st=st+"#"+ch;
		}
		st=st+"#"+str+"#";
		System.out.println(st);
	}
	
	
	public static void main(String[] args) {
		// task
		JLAB_S obj = new JLAB_S();
		obj.square(23);
		obj.square(65);

		System.out.println();
		// task
		int[] arr = { 1, 7, 9, 12 };
		for (int i = 0; i < arr.length; i++) {
			int a = arr[i];
			System.out.println(obj.square(a));
		}
		System.out.println();
		// task
		for(int i=0;i<arr.length;i++) {
			int a= arr[i];
			System.out.println(obj.square(a));
			System.out.println(obj.cube(a));
			
			
		}
		System.out.println();
		// task
		obj.sumSquareCube(2);
		obj.sumSquareCube(9);
		obj.sumSquareCube(11);
		System.out.println();
		
		// task
		int power[]= {3,5,8};
		for(int i=0; i<power.length;i++) {
			int a=power[i];
			obj.power4(a);
			obj.power5(a);
		}
		System.out.println();
		
		// task
		obj.pattern1(2);
		obj.pattern1(4);
		System.out.println();
		
		// task
		obj.patter2("hello");
		obj.patter2("trisect");
	}

}
