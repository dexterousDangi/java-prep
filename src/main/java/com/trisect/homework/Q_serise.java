package com.trisect.homework;

public class Q_serise {

	public static void main(String[] args) {

		// task 1
		String str1 = "MostWanted50";
		System.out.println("given string :" + str1);
		char ch1;
		int inte = 0;
		int alpha = 0;
		for (int i = 0; i < str1.length(); i++) {
			ch1 = str1.charAt(i);
			if (ch1 >= 'a' && ch1 <= 'z')
				alpha = alpha + 1;
			if (ch1 >= 'A' && ch1 <= 'Z')
				alpha = alpha + 1;
			if (ch1 >= '0' && ch1 <= '9')
				inte = inte + 1;
		}
		System.out.println("Digits -" + inte);
		System.out.println("Alphabats -" + alpha);
		System.out.println();

		// task 2

		String str2 = "trisect";
		System.out.println("given string :" + str2);
		char ch2;
		String out2 = "";
		for (int i = 0; i < str2.length(); i++) {
			ch2 = str2.charAt(i);
			if (i % 2 != 0)
				out2 = out2 + "#";
			else
				out2 = out2 + ch2;
			System.out.println(out2);
		}
		// TASK 3
		String str3 = "#C#O#D#E#";
		char ch3;
		String out3 = "";
		for (int i = 0; i < str3.length(); i++) {
			ch3 = str3.charAt(i);
			if (ch3 == '#') {
			} else {
				out3 = out3 + ch3;
			}
		}
		System.out.println("New String :" +out3);
	}
}
