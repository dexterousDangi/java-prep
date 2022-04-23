package com.trisect.homework;

public class JB4CO implements Cloneable {

	public static void main(String[] args) {
		// PROBLEM 1:
		String str1 = "world";
		System.out.println("string givne :" + str1);
		char ch1;
		String out1 = "";
		for (int i = 0; i < str1.length(); i++) {
			ch1 = str1.charAt(i);
			out1 = out1 + ch1 + ch1;
		}
		System.out.println("desired string :" + out1);
		System.out.println();

		// problem 2
		String str2 = "cat";
		System.out.println("string given :" + str2);
		char ch2;
		String out2 = "";
		System.out.println("desired string:");
		for (int i = 0; i < str2.length(); i++) {
			ch2 = str2.charAt(i);
			out2 = out2 + ch2;
			System.out.println(out2);
		}
		System.out.println();

		// problem 3
		String str3 = "trisect";
		System.out.println("given string :" + str3);
		char ch3;
		String out3 = "";
		for (int i = str3.length() - 1; i >= 0; i--) {
			ch3 = str3.charAt(i);
			out3 = out3 + ch3;
		}
		System.out.println("reverse of the string :" + out3);
		System.out.println();

		// problem 4
		String str4 = "trisect";
		System.out.println("string given :" + str4);
		char ch4;
		String out4 = "";
		for (int i = 0; i < str4.length(); i = i + 2) {
			ch4 = str4.charAt(i);
			out4 = out4 + ch4;
		}
		System.out.println("desired string :" + out4);
		System.out.println();

		// Problem 5
		String str5 = "CatBatMat";
		System.out.println("string given :" + str5);
		char ch5;
		String out5 = "";
		String low1 = "";
		String upr1 = "";
		for (int i = 0; i < str5.length(); i++) {
			ch5 = str5.charAt(i);
			if (ch5 >= 'A' && ch5 <= 'Z') {
				upr1 = upr1 + ch5;
			}
			if (ch5 >= 'a' && ch5 <= 'z') {
				low1 = low1 + ch5;
			}
		}
		out5 = upr1 + low1;
		System.out.println("desired string :" + out5);
		System.out.println();

		// problem 6
		String str6 = "sFact10AST";
		System.out.println("string given :" + str6);
		char ch6;
		String out6 = "";
		String low2 = "";
		String upr2 = "";
		String in = "";
		for (int i = 0; i < str6.length(); i++) {
			ch6 = str6.charAt(i);
			if (ch6 >= '0' && ch6 <= '9')
				in = in + ch6;
			if (ch6 >= 'A' && ch6 <= 'Z')
				upr2 = upr2 + ch6;
			if (ch6 >= 'a' && ch6 <= 'z')
				low2 = low2 + ch6;
		}
		out6 = in + low2 + upr2;
		System.out.println("desired string :" + out6);
	}
}
