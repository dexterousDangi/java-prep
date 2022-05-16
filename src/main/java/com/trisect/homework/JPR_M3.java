package com.trisect.homework;

import java.util.Arrays;

public class JPR_M3 {

	public static void main(String[] args) {

		// task1
		int[] num1 = { 4, 14, 6, 12, 345, 5, 10 };
		int count1 = 0;
		for (int i : num1) {
			if (i % 10 == i)
				count1 += 1;
		}
		System.out.println(Arrays.toString(num1));
		System.out.println("single Digit in array " + count1);
		System.out.println();

		// task2
		int[] num2 = { 4, 14, 6, 12, 345, 5, 1 };
		System.out.println(Arrays.toString(num2));
		int change2 = 0;
		if (num2[0] > num2[num2.length - 1])
			change2 = num2[0];
		else
			change2 = num2[num2.length - 1];
		for (int i = 0; i < num2.length; i++) {
			num2[i] = change2;
		}
		System.out.println(Arrays.toString(num2));
		System.out.println();

		// task 4
		int[] num3 = { 1, 2, 4, 5, 6, 8 };
		boolean b3 = false;
		for (int i = 0; i < num3.length; i++) {
			if (i <= num3.length - 2) {
				if (num3[i] % 2 == 0 && num3[i + 1] % 2 == 0) {
					b3 = true;
				}
			}
		}
		System.out.println(b3);
		System.out.println();

		// task 5
		int[] num5 = { 1, 2, 3, 4, 5, 6 };
		System.out.println(Arrays.toString(num5));
		int[] nm5 = new int[num5.length - 1];
		int size5 = 0;
		for (int i = 0; i < num5.length; i++) {
			if (num5.length == 1) {
				break;
			} else if (i < num5.length - 1) {
				nm5[size5] = num5[i] + num5[i + 1];
				size5++;
			}
		}
		System.out.println(Arrays.toString(nm5));
		System.out.println();

		// task 6
		int[] num6 = { 2, 4, 5, 7, 8, 9, 10, 14, 20 };
		boolean b6 = false;
		for (int i = 0; i < num6.length; i++) {
			if (i < num6.length - 2) {
				if ((num6[i] % 2 == 0) && (num6[i + 1] % 2 == 0) && (num6[i + 2] % 2 == 0)) {
					b6 = true;
				}
			}
		}
		System.out.println("3 Evens : " + b6);
		System.out.println();

		// task 7
		int[] a7 = { 0, 0, 1 };
		int[] b7 = { 5, 10, 20 };
		System.out.println(Arrays.toString(a7));
		System.out.println(Arrays.toString(b7));
		int add7 = 0;
		for (int i = 0; i < a7.length; i++) {
			add7 = add7 + (a7[i] * b7[i]);
		}
		System.out.println("added and multiplied : " + add7);
		System.out.println();

		// task8
		int[] a8 = { 2, 12, 34 };
		int[] b8 = { 22, 24 };
		System.out.println(Arrays.toString(a8));
		System.out.println(Arrays.toString(b8));
		int size = a8.length + b8.length;
		int[] num8 = new int[size];
		int ask1 = 0;
		int ask2 = 0;
		for (int i = 0; i < size; i++) {
			if (i < a8.length) {
				num8[i] = a8[ask1];
				ask1++;
			}
			if (i >= a8.length) {
				num8[i] = b8[ask2];
				ask2++;
			}
		}
		System.out.println("combinec arrays :" + Arrays.toString(num8));
		System.out.println();

		// task 9
		String[] str9 = { "bear", "bell", "call", "all" };
		int count9 = 0;
		String out9 = "";
		for (int i = 0; i < str9.length; i++) {
			String str = str9[i];
			if (str.charAt(0) == 'a' || str.charAt(0) == 'b' || str.charAt(0) == 'c') {
				count9 += 1;
				out9 = out9 + str + ",";

			}
		}
		System.out.println("count : " + count9);
		System.out.println("Strings : " + out9);
		System.out.println();

		// task10
		String[] str10 = { "Hello", "how", "are", "you" };
		System.out.println(Arrays.toString(str10));
		String add10 = "";
		for (int i = 0; i < str10.length; i++) {
			String str = str10[i];
			char ch = str.charAt(0);
			add10 = add10 + ch;
		}
		System.out.println(add10);
		System.out.println();

		// task11
		String[] str11 = { "cat", "bite", "roar", "had", "lamb" };
		int count11 = 0;
		for (int i = 0; i < str11.length; i++) {
			String str = str11[i];
			if (str.charAt(str.length() - 1) == 'e' || str.charAt(str.length() - 1) == 't') {
				++count11;
			}
		}
		String[] out11 = new String[count11];
		int size11 = 0;
		for (int i = 0; i < str11.length; i++) {
			String str = str11[i];
			if (str.charAt(str.length() - 1) == 'e' || str.charAt(str.length() - 1) == 't') {
				out11[size11] = str;
				size11++;
			}
		}
		System.out.println(Arrays.toString(str11));
		System.out.println(Arrays.toString(out11));
		System.out.println();

		// task13
		int[] num13 = { 1, 2, 3, 4, 5 };
		int[] out13 = new int[num13.length];
		int size13 = 0;
		for (int i = num13.length - 1; i >= 0; i--) {
			out13[size13++] = num13[i];
		}
		System.out.println(Arrays.toString(num13));
		System.out.println(Arrays.toString(out13));
		System.out.println();

		// task14
		int[] a14 = { 1, 2, 3 };
		int[] b14 = { 10, 20, 30 };
		int out14[] = new int[a14.length + b14.length];
		int sizeA = 0;
		int sizeB = 0;
		for (int i = 0; i < out14.length;) {
			out14[i++] = a14[sizeA++];
			out14[i++] = b14[sizeB++];

		}
		System.out.println(Arrays.toString(a14));
		System.out.println(Arrays.toString(b14));
		System.out.println(Arrays.toString(out14));
		System.out.println();

		// task 16
		int[] num16 = { 1, 6, 7, 8, 9, 2, 4, 5, 6, 7 };
		String str16 = "";
		for (int i = 0; i < num16.length; i++) {

			if (i < num16.length - 2) {
				int size16 = i;
				if (num16[size16++] % 2 != 0 && num16[size16++] % 2 == 0 && num16[size16] % 2 != 0) {
					str16 = str16 + num16[++i] + ",";
				}
			}
		}
		System.out.println(str16);
		System.out.println();

		// task17 ?
		int[] num17 = { 10, 20, 20, 30, 32, 32, 32, 34 };
		int max17 = 0;
		String str17 = "";
		for (int i = 0; i < num17.length; i++) {
			int size17 = i;
			if (i < num17.length - 1) {
				if (num17[size17] == num17[++size17]) {
					max17++;
					str17 = str17 + num17[i] + ",";
				}
			}

		}
		System.out.println(str17 + " " + max17);

		// task19
		int a19[] = { 1};
		int b19[] = { 2,1,2,3,4 };
		int a=0,b=0;
		int out19[] = new int[a19.length + b19.length];
		for (int i = 0; i < out19.length;) {
				if(a<a19.length) {
					out19[i++]=a19[a++];
				}
				if(b<b19.length) {
					out19[i++]=b19[b++];
				}
		}
		System.out.println(Arrays.toString(a19));
		System.out.println(Arrays.toString(b19));
		System.out.println(Arrays.toString(out19));

	}

}















