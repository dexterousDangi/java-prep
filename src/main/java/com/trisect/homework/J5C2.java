package com.trisect.homework;

import java.util.Arrays;

public class J5C2 {

	public void firstThree(String str) {
		System.out.println("printing only first three character of the string: " + str);
		String nw = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			nw = nw + ch;
			if (i == 2)
				i = str.length();
		}
		System.out.println(nw);
	}

	public void printTotalA(String[] str) {
		System.out.println(
				"printing only first three character of the every string in the array:" + Arrays.toString(str));
		String st = null;
		String al = "";
		for (int i = 0; i < str.length; i++) {
			st = str[i];
			al = "";
			for (int j = 0; j < st.length(); j++) {
				char ch = st.charAt(j);
				al = al + ch;
				if (j == 2) {
					System.out.println(al);
					j = st.length();
				}
			}
		}
	}

	public void cleanString(String str) {
		System.out.println("print neat and clean string :" + str);
		String neat = "";
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z')
				neat = neat + ch;
		}
		System.out.println(neat);
	}

	public void print2(String[] str) {
		System.out.println("print only alphabats in the string avaiable: " + Arrays.toString(str));
		String ne = "";
		for (int i = 0; i < str.length; i++) {
			String lw = str[i];
			ne = "";
			for (int j = 0; j < lw.length(); j++) {
				char ch = lw.charAt(j);
				if (ch >= 'a' && ch <= 'z') {
					ne = ne + ch;
				}

			}
			System.out.println(ne);
		}
	}

	public void numberSerise(int a) {
		System.out.println("printing counting till :" + a);
		String alpha = "";
		for (int i = 1; i <= a; i++)
			alpha = alpha + i;
		System.out.println(alpha);
	}

	public void seriesArray(int[] a) {
		System.out.println("given array :" + Arrays.toString(a));
		String[] serise = new String[a.length];
		String arr = "";
		for (int i = 0; i < a.length; i++) {
			int at = a[i];
			arr = "";
			for (int j = 1; j <= at; j++) {
				arr = arr + j;
			}
			serise[i] = arr;
		}
		System.out.println(Arrays.toString(serise));
	}

	public static void main(String[] args) {
		J5C2 check = new J5C2();
		check.firstThree("abcd");
		check.firstThree("daycare");
		String[] printA = { "abef", "abacd", "bcd" };
		check.printTotalA(printA);
		check.cleanString("34neot3");
		String[] st = { "ben10", "3sad" };
		check.print2(st);
		check.numberSerise(2);
		check.numberSerise(5);
		int[] ab = { 1, 4, 2 };
		check.seriesArray(ab);
	}

}
