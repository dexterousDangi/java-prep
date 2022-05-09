package com.trisect.homework;

import java.util.Arrays;

public class JLAB_S3_onwards {

	public void evenOdd(int[] n) {
		int num = 0;
		for (int i = 0; i < n.length; i++) {
			num = n[i];
			if (num % 2 == 0)
				System.out.println(num + ": even");
			else
				System.out.println(num + ": odd");
		}
	}

	public void drink(int[] arr) {
		for (int a : arr) {
			if (a % 2 == 0) {
				if (a % 2 == 0 && a % 3 == 0) {
					System.out.println(a + ": PepsiCoke");
					break;
				}
				System.out.println(a + " :Pepsi ");
			} else if (a % 3 == 0) {

				System.out.println(a + " :Coke");

			} else
				System.out.println(a + " :PaperBoat");
		}
	}

	public void isMultipleOf3(int n) {

		if (n % 3 == 0)
			System.out.println(n + " : yes");
		else
			System.out.println(n + " : No");
	}

	public void isMultipleOf3(int[] n) {
		for (int i = 0; i < n.length; i++) {
			int num = n[i];
			isMultipleOf3(num);
		}
	}

	public void replace0and5(int[] replace) {
		int num = 0;
		int newSize = 0;
		for (int i = 0; i < replace.length; i++) {
			num = replace[i];
			if (num == 0) {
				newSize++;
			} else if (num % 5 == 0) {
			} else {
				newSize++;
			}
		}
		System.out.println("size =" + newSize);
		int[] newArr = new int[newSize];
		int size = 0;
		for (int i = 0; i < replace.length; i++) {
			num = replace[i];
			if (num == 0) {
				newArr[size] = 99;
				size++;
			} else if (num % 5 == 0) {
			} else {
				newArr[size] = num;
				size++;
			}

		}
		System.out.println(Arrays.toString(newArr));
	}

	public void grade(int a) {
		if (a > 89) {
			System.out.println("Grade A");
		} else if (a > 74 && a < 90)
			System.out.println("Grade B");
		else if (a > 39 && a < 75)
			System.out.println("Grade C");
		else
			System.out.println("Fail");
	}

	public void grade(int[] num) {
		for (int i = 0; i < num.length; i++) {
			System.out.println("Subject #" + (i + 1) + ":");
			int mark = num[i];
			grade(mark);
		}
	}

	public void breakHalf(String str) {
		int half = str.length() / 2;
		System.out.println(half);
		char ch;
		String str1 = "";
		for (int i = half; i < str.length(); i++) {
			ch = str.charAt(i);
			str1 = str1 + ch;
		}
		str1 = str1 + "#" + str + "#";

		for (int i = 0; i < half; i++) {
			ch = str.charAt(i);
			str1 = str1 + ch;
		}
		System.out.println(str1);
	}

	public void countLowerCase(String str) {
		char ch;
		int lowercase = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z')
				lowercase++;
		}
		System.out.println("Lowercase = " + lowercase);
	}

	public void countLowerCase(String[] str) {

		String lower = "";
		for (int i = 0; i < str.length; i++) {
			lower = str[i];
			System.out.print(lower + ":");
			countLowerCase(lower);
		}
	}

	public void encode(String str, int a) {
		String ence="";
		char ch ;
		if(a==0) {
			for(int i=0;i<str.length();i++) {
				ch=str.charAt(i);
				if(i%2==0)
					ence=ence+"#";
				else
					ence=ence+ch;
			}System.out.println(ence);
		}
		if(a==1) {
			for(int i=0;i<str.length();i++) {
				ch=str.charAt(i);
				if(i%2!=0)
					ence=ence+"#";
				else
					ence=ence+ch;
			}System.out.println(ence);
		}
		
	}
	
	public static void main(String[] args) {

		JLAB_S3_onwards obj = new JLAB_S3_onwards();

		// task
		int[] num = { 10, 9, 12, 5, 7 };
		obj.evenOdd(num);
		System.out.println();

		// task
		int[] sip = { 5, 13, 15, 20, 36 };
		obj.drink(sip);
		System.out.println();

		// task
		obj.isMultipleOf3(7);
		obj.isMultipleOf3(15);
		System.out.println();

		// task
		int[] mul = { 21, 4, 12, 32, 33 };
		obj.isMultipleOf3(mul);
		System.out.println();

		// task
		int[] replace = { 0, 45, 24, 98, 0, 100, 110 };
		obj.replace0and5(replace);
		System.out.println();

		// task
		int[] marks = { 78, 75, 40, 39, 99 };
		obj.grade(marks);
		System.out.println();

		// task
		obj.breakHalf("coding");
		System.out.println();

		// task
		obj.countLowerCase("Trisect");
		System.out.println();

		// task
		String[] lower1 = { "TEST", "car", "HeeL" };
		obj.countLowerCase(lower1);
		System.out.println();
		
		// task
		obj.encode("hello", 0);
		obj.encode("trisect", 1);
	}
}
