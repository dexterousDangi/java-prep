// to find the upper case and lower case characters in a string
package com.trisect.homework;

import java.util.Scanner;

public class String_usage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word on which we perform operations");;
		String str =sc.nextLine();
		sc.close();
		int len = str.length();
		System.out.println("length of the word enterred : "+ len);
		
		System.out.println("lower case letters");
		char ch;
		int lower = 0;
		int upper =0;
		for(int i=0; i<len; i++) { 
			ch = str.charAt(i);
			if(ch>='a' && ch<='z') {
				lower = lower+1;
				System.out.println(ch);
			}
		}System.out.println(" Number of lower case charaters :" +lower);
		System.out.println("Upper case latters");
		for(int i=0; i<len;i++) {
			ch=str.charAt(i);
			if(ch>='A' && ch<='Z') {
				upper =upper +1;
				System.out.println(ch);
			}
			
			
		}System.out.println("Number of upper case latters:" + upper);
			
		}
		
	}

