package com.trisect.homework;

public class JLAB_S6_onwards {
	public void countInRange(String str) {
		char ch;
		int range = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if ((ch >= 'a' && ch <= 'd') || (ch >= 'A' && ch <= 'D'))
				range++;
		}
		System.out.println("in Range = " + range);
	}

	public void countInRange(String[] str) {
		String st = "";
		for (int i = 0; i < str.length; i++) {
			st = str[i];
			countInRange(st);
		}
	}

	public void decode(String str, int a) {
		String newstr = "";
		if (a == 0) {
			char ch;
			for (int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);
				if (ch == '#')
					newstr = newstr + "a";
				else if (ch == '*')
					newstr = newstr + "e";
				else
					newstr = newstr + ch;
			}
			System.out.println(newstr);
		}
		if (a == 1) {
			char ch;
			for (int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);
				if (ch == '#')
					newstr = newstr + "i";
				else if (ch == '*')
					newstr = newstr + "o";
				else
					newstr = newstr + ch;
			}
			System.out.println(newstr);

		}
	}

	public void extractArrays(int[] arr1, int[] arr2) {
		int a = 0;
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			a = arr1[i];
			if (a >= 25 && a <= 75)
				sum = sum + a;
		}

		for (int i = 0; i < arr2.length; i++) {
			a = arr2[i];
			if (a >= 25 && a <= 75)
				sum = sum + a;
		}
		System.out.println("total sum =" + sum);
	}

	public void pattern(int a) {

		for (int i = 1; i <= a; i++) {
			String str = "";
			for (int j = 1; j <= a; j++) {
				str = str + "*";
			}
			if (i % 2 == 0)
				str = str + i;
			else
				str = i + str;

			System.out.println(str);
		}

	}

	public int square(int a) {
		int square = a * a;
		return square;

	}

	public String removeChar(String str, char ch) {

		String str1 = "";
		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c != ch)
				str1 = str1 + c;
		}
		return str1;
	}

	public int power(int a, int b) {
		int se = 0;
		if (b % 2 != 0) {
			se = a * a;
		} else
			se = a * a * a;
		return se;
	}

	public String moveChar(String str, char ch) {
		String newStr1 = "";
		String newStr2 = "";
	
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == ch) {
				newStr1 = newStr1 + c;
			} else
				newStr2 = newStr2+c;
		}
		return newStr2+newStr1;
	}

	public static void main(String[] args) {
		JLAB_S6_onwards obj = new JLAB_S6_onwards();

		// task
		obj.countInRange("coDe");
		System.out.println();

		// task
		String[] input = { "TEST", "car", "AbaCus" };
		obj.countInRange(input);
		System.out.println();

		// task
		obj.decode("h*llo", 0);
		obj.decode("c#r*", 0);
		obj.decode("s*l#d", 1);
		System.out.println();

		// task
		int[] a = { 69, 31, 77 };
		int[] b = { 26, 0 };
		obj.extractArrays(a, b);
		System.out.println();

		// task
		obj.pattern(4);
		obj.pattern(2);
		System.out.println();

		// task
		int[] sq = { 8, 6, 9 };
		for (int i = 0; i < sq.length; i++) {
			System.out.println(obj.square(sq[i]));
		}
		System.out.println();

		// task
		System.out.println(obj.removeChar("trisect", 't'));
		System.out.println();

		// task
		String str[] = { "dad", "car", "dat" };
		for (int i = 0; i < str.length; i++) {
			String nws = str[i];
			System.out.println(obj.removeChar(nws, 'd'));
		}

		// task
		System.out.println(obj.power(3, 12));
		System.out.println(obj.power(9, 1));
		System.out.println();

		// task
		int[] squ = { 4, 3, 10 };
		for (int i = 0; i < squ.length; i++) {
			int bb = squ[i];
			if (i % 2 == 0)
				System.out.println(bb + " cube = " + obj.power(bb, i));
			else
				System.out.println(bb + " square = " + obj.power(bb, i));
		}
		System.out.println();

		// task
		int[] trio = { 8, 6, 9 };
		int sum = 0;
		for (int i = 0; i < trio.length; i++) {
			sum = sum + obj.power(trio[i], i);
		}
		System.out.println(sum);
		System.out.println();

		// task
		System.out.println(obj.moveChar("trisect", 't'));
		System.out.println(obj.moveChar("hello", 'l'));
		System.out.println();
		
		//task
		String [] call= {"dad","car","tiptop"};
		for(int i=0;i<call.length;i++) {
		char ch=call[i].charAt(0);
		System.out.println(obj.moveChar(call[i], ch));			
		}
	}
}
