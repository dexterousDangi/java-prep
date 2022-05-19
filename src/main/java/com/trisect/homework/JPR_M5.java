package com.trisect.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JPR_M5 {

	public static void main(String[] args) {

		// task 1
		int n1 = 4;
		boolean check = true;
			for (int i = 2; i < n1; i++) {
				if( (n1 %i )== 0) {
					check = false;
					break;
				}
			}
		
		if (check) {
			System.out.println(n1 + " :  is a prime no.");
		} else {
			System.out.println(n1 + " not prime no.");
		}System.out.println();

		// task 2 
		int n2=99;
		List<Integer> list= new ArrayList<Integer>();
		for(int numberCheck=2;numberCheck<=n2;numberCheck++) {
			boolean isprime=true;
			for(int factor=2;factor<=numberCheck/2;factor++) {
				if(numberCheck%factor==0) {
					isprime=false;
					break;
				}
			}if(isprime) {
				list.add(numberCheck);
			}
		}System.out.println("Prime no. from 1 to "+n2 );
		System.out.println(list);
		System.out.println();
		
		// task3
		int n3 = 3;
		if (n3 % 5 == 0) {
			if (n3 % 3 == 0) {
				System.out.println("fizz Buzz");
				return;
			}
			System.out.println("Fizz");
		} else if (n3 % 3 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println("nothing");
		}
		System.out.println();

		// task4
		int n4 = 20;
		for (int i = 1; i <= n4; i++) {
			if (i % 5 == 0) {
				if (i % 3 == 0) {
					System.out.print(" fizz Buzz, ");
					continue;
				}
				System.out.print(" Fizz, ");
			} else if (i % 3 == 0) {
				System.out.print(" Buzz, ");
			} else {
				System.out.print(i + ", ");
			}

		}
		System.out.println();
		System.out.println();

		// task5
		int n5 = 127;
		while (n5 % 2 == 0) { // checking whether the no is even or not
			n5 = n5 / 2;
		}
		if (n5 == 1) {
			System.out.println(" number is a power of 2");
		} else {
			System.out.println(" number is not a power of 2");
		}
		System.out.println();

		int nn5 = 127;
		if (((nn5) & (nn5 - 1)) == 0) {
			System.out.println(nn5 + " : is a power of 2");
		} else {
			System.out.println(nn5 + " : is not a power of 2");
		}
		System.out.println();

		// task 6
		String str6 = "12$%@####wow#&9";
		String out6 = "";
		for (int i = 0; i < str6.length(); i++) {
			char ch = str6.charAt(i);
			if (i > 0 && str6.charAt(i - 1) == ch && ch == '#') {
				;
			} else {
				out6 = out6 + ch;
			}
		}
		System.out.println(out6);
		System.out.println();

		// task7 ?
		int n7 = 14;
		String ones[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String tens[] = { "zero", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "seventeen", "eighteen",
				"nineteen", "twenty" };
		String ten[] = { "thrity", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };

		// task 8 ?

		// task 9
		int n9 = 4;
		for (int i = 1; i <= n9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("x");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		System.out.println();

		// task 10

		int n10 = 3, x10 = 8;
		int add10 = 0;
		int pow = 0;
		for (int i = 1; i <= x10; i++) {
			pow = 1;
			for (int j = 1; j <= n10; j++) {
				pow = pow * i;
			}
			add10 = add10 + pow;
		}
		System.out.println(add10);
		System.out.println();

		// task11
		int n11 = 10;
		int add11 = 0;
		while (n11 > 0) {
			int a = n11 % 10;
			add11 = add11 + a;
			n11 = n11 / 10;
		}
		System.out.println(add11);
		System.out.println();

		// task12
		int[] num12 = { 10, 25, 456, 67 };
		int add12 = 0;
		String out12 = "";
		for (int i = 0; i < num12.length; i++) {
			int a = num12[i];
			add12 = 0;
			while (a > 0) {
				int r = a % 10;
				add12 = add12 + r;
				a = a / 10;
			}
			out12 = out12 + add12 + ", ";
		}
		System.out.println(Arrays.toString(num12));
		System.out.println(out12);
		System.out.println();

		// task13
		int n13 = 45;
		String bin = "";
		while (n13 > 0) {
			int rem = n13 % 2;
			bin = bin + rem;
			n13 = n13 / 2;
		}
		System.out.println("Binary =" + bin);
		System.out.println();

		// task 14
		int[] n14 = { 2, -5, 4, 12, -7, -9, 6, 3, -10 };
		int[] num14 = new int[n14.length];
		int a = 0, b = 0, c = 0;
		while (a < n14.length) {
			if (n14[a] >= 0) {
				num14[b] = n14[a];
				b++;
			}
			a++;
		}
		System.out.println(Arrays.toString(num14));

		while (c < n14.length) {
			if (n14[c] < 0) {
				num14[b] = n14[c];
				b++;
			}
			c++;
		}
		System.out.println(Arrays.toString(num14));
		System.out.println();

		// task15
		int[] n15 = { 1, 2, 8, 3, 5, 6, 4, 3, 2 };
		String out15 = "";
		for (int i = 0; i < n15.length; i++) {
			int ab = n15[i];
			int count = 0;
			for (int j = i + 1; j < n15.length; j++) {
				if (ab < n15[j]) {
					count = 1;
				}
			}
			if (count == 0) {
				out15 = out15 + ab + ",";
			}
		}
		System.out.println("numbers : " + out15);
		System.out.println();

		// task16 ?
		String str16 = "001001";
		int res16 = 0;
		int out16 = 0;
		int ii=Integer.parseInt(str16,2);
		System.out.println(ii);
		for (int i = str16.length() - 1; i >= 0; i--) {
			char ch = str16.charAt(i);
			if (ch == '0') {
				res16 = 0;
			} else {
				res16 = 1;
				for (int j = str16.length()-i; j < str16.length(); j++) {
					res16 = res16 * 2;
				}
			}
			out16 = out16 + res16;
		}
		System.out.println(out16);
		System.out.println();
		
		//task 17 ?
		
		//task18
		int [] num18={0,0,0,1,2,3,0,4,0};
		int [] out18= new int [num18.length];
		int aa=0,bb=0;
		while(aa<num18.length) {
			if(num18[aa]>0) {
				out18[bb]=num18[aa];
				bb++;
			}
			aa++;
		}
		while(bb<num18.length) {
			out18[bb++]=0;
		}
		System.out.println(Arrays.toString(num18));
		System.out.println(Arrays.toString(out18));

	}

}
