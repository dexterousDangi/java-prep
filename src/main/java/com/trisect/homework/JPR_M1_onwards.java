package com.trisect.homework;

public class JPR_M1_onwards {

	public static void main(String[] args) {

		// task 1
		int n1 = 4;
		String str = "";
		for (int i = 1; i <= n1; i++) {
			str = str + ("y" + i);
			System.out.println(str);
		}
		System.out.println();

		// task2
		int n2 = 15;
		System.out.println("no to be entered : " + n2);
		for (int i = 2; i <= 5; i++) {
			if (n2 % i == 0) {
				System.out.println(i + " : yes");
			} else {
				System.out.println(i + " : no");
			}
		}
		System.out.println();

		// task3
		int n3 = 5;
		String str3 = "";
		for (int i = 1; i <= n3; i++) {
			if (i % 2 == 0) {
				str3 = str3 + "B";
			} else {
				str3 = str3 + "A";
			}
			System.out.println(i + " :" + str3);
		}
		System.out.println();

		// task4
		int n4 = 4;
		String str4 = "";
		for (int i = 1; i <= n4; i++) {

			if (i <= n4) {
				str4 = str4 + "M";
				i++;
			}
			if (i <= n4) {
				str4 = str4 + "N";
				i++;
			}
			if (i <= n4) {
				str4 = str4 + "O";
			}

		}
		System.out.println(str4);
		System.out.println();

		// task5
		int a = 1;
		int b = 1;
		int c = 19;
		int res5 = a > b ? a > c ? a : c : b > c ? b : c; // will give us largest among three no.
		System.out.println(res5);
		if (a > b && a < c || a > c && a < b) {
			System.out.println("middle no. :" + a);
		}
		if (b > a && b < c || b > c && b < a) {
			System.out.println("middle no. : " + b);

		}
		if (c > a && c < b || c > b && c < a) {
			System.out.println("middle no. : " + c);
		}
		if (a == b && b == c) {
			System.out.println("middle no.: " + a);
		}
		if (a == b) {
			if (a > c) {
				System.out.println("middle no. : " + c);
			} else
				System.out.println("middle no. : " + a);
		}
		if (b == c) {
			if (a > c)
				System.out.println("middle no. : " + c);
			else
				System.out.println("middle no. : " + a);

		}
		if (c == a) {
			if (a > b)
				System.out.println("middle no. : " + b);
			else
				System.out.println("middle no. : " + a);
		}
		System.out.println();

		// task7
		int n6 = 5;
		int res6 = 1;
		int add6 = 0;
		for (int i = 1; i <= n6; i++) {
			res6 = 1;
			for (int j = 1; j <= i; j++) {
				res6 = res6 * 3;
			}
			add6 = add6 + res6;
		}
		System.out.println("result .. : " + add6);
		System.out.println();

		// task 8
		int n7 = 5;
		int power7 = 4;
		int res7;
		int add7 = 0;
		for (int i = 1; i <= power7; i++) {
			res7 = 1;
			for (int j = 1; j <= i; j++) {
				res7 = res7 * n7;
			}
			add7 = add7 + res7;
			System.out.println(res7);

		}
		System.out.println("addition of all powers : " + add7);
		System.out.println();

		// task 9

		int a9 = 7, b9 = 5;
		String str9 = "";
		for (int i = 1; i <= b9; i++) {
			int res = a9 * (i + 1);
			str9 = str9 + res + "#";
		}
		System.out.println(str9);
		System.out.println();

		// task10
		int n10 = 7;
		String str10 = "";
		int res10 = 0;
		for (int i = 1; i < n10; i++) {
			res10 = (n10) * (n10 - 1);
			res10 = res10 * i;
			str10 = str10 + res10 + "#";
		}
		System.out.println(str10);
		System.out.println();

		// task11
		int n11 = 8;
		String str11 = "";
		for (int i = n11; i >= 1; i--) {
			if (i % 3 == 0)
				str11 = str11 + "x";
			else {
				str11 = str11 + i;
			}
			System.out.println(str11);
		}
		System.out.println();

		// task12
		int n12 = 4;
		int add12 = 0;
		String str12 = "";
		for (int i = 1; i <= n12; i++) {
			if (i % 2 == 0) {
				add12 = add12 - i;
				str12 = str12 + "-" + i;
			} else {
				add12 = add12 + i;
				str12 = str12 + "+" + i;
			}
		}
		System.out.println(str12 + "=" + add12);
		System.out.println();

		// task13
		int n13 = 9;
		String divide = "";
		String Notdivide = "";
		for (int i = 1; i <= n13; i++) {
			if (n13 % i == 0) {
				divide = divide + i + "#";
			} else {
				Notdivide = Notdivide + i + "#";
			}
		}
		System.out.println("Divide :" + divide);
		System.out.println("Not Divide :" + Notdivide);
		System.out.println();

		// task14
		int x = 21, y = 65;
		int comp = 0;
		if (x > y)
			comp = y;
		else
			comp = x;
		int min = 0;
		int hcf = 0;
		for (int i = 1; i <= comp; i++) {
			if (x % i == 0 && y % i == 0) {
				min = i;
			}
			if (hcf < min) {
				hcf = min;
			}
		}
		System.out.println("hcf of " + x + "," + y + " is : " + hcf);
		System.out.println();

		// task15
		int n15 = 5;
		String str15 = "";
		for (int i = 1; i <= n15; i++) {
			str15 = str15 + i;
			for (int j = 1; j <= i; j++) {
				str15 = str15 + "#";
			}
		}
		System.out.println(str15);
		System.out.println();

		// task16
		int n16 = 1456;
		int rem = 0;
		int add16 = 0;
		System.out.println(n16);
		for (int i = 1; i <= 4; i++) {
			rem = n16 % 10;
			add16 = rem + add16;
			n16 = n16 / 10;
		}
		System.out.println("sum of all the digits in no.: " + add16);
		System.out.println();

		// task17
		int l = 8, m = 9, n = 4;
		if ((l + m > n) && (m + n > l) && (n + l > m)) {
			System.out.println("triangle is possible");
		} else
			System.out.println("triangle is not possible");
		System.out.println();

		// task 18
		int j = 8, k = 6, h = 10;
		if ((j + k > h) && (k + h > j) && (j + h > k)) {
			if (((j * j) + (k * k) == (h * h)) || ((k * k) + (h * h) == (j * j)) || ((j * j) + (h * h) == (k * k))) {
				System.out.println("triangle is right anle triangle");
			} else {
				System.out.println("not a right angle triangle but a normal triangle");
			}
		} else {
			System.out.println("not a right angle triangle");
		}

	}

}
