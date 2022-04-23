package com.trisect.homework;

public class String_2 {

	public static void main(String[] args) {
	
		//problem 1
		String str1= "abcab";
		System.out.println("string given :"+str1);
		int count1 =0;
		char ch1	;
		for(int i=0; i<str1.length();i++) {
			ch1= str1.charAt(i);
			if(ch1=='a')
				count1=count1+1;
		}System.out.println("no. of 'a' in the sring :"+count1);
		System.out.println();
	
		// problem 2
	String str2="abcdb";
	System.out.println("string given :"+str2);
	int count2=0;
	char ch2;
	for(int i=0;i<str2.length();i++) {
		ch2= str2.charAt(i);
		if(ch2=='a' || ch2=='b')
			count2 =count2 +1;
	}System.out.println("no. of a and b in the string :" + count2);
	System.out.println();
	
	//problem3
	String str3="one2315three";
	System.out.println("string given :"+str3);
	char ch3;
	for(int i=0; i<str3.length();i++) {
		ch3=str3.charAt(i);
		/*if(ch3=='1')
			System.out.println(ch3+" :found");
		if(ch3=='2')
			System.out.println(ch3+" :found");
		if(ch3 =='3')
			System.out.println(ch3 +" :found");
		*/
		//or 
		if(ch3=='1' || ch3=='2' || ch3== '3')
			System.out.println(ch3 +" :found");
		
	}	System.out.println();
		
	//problem4
	
	
	
	}
}
