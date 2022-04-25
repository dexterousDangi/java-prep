package com.trisect.homework;

import java.util.Arrays;

public class JC3CO {

	public static void main(String[] args) {

		// problem 1:
		int[] arr1 = { 1, 2, 4, 5 };
		System.out.println(Arrays.toString(arr1));
		for (int i = 0; i < arr1.length; i++) {
			int num = arr1[i];
			num = num * 3;
			arr1[i] = num;
		}
		System.out.println("every elements increased three times :" + Arrays.toString(arr1));
		System.out.println();

		// problem 2
		int[] arr2 = { 12, 10, 3, 4, 5 };
		System.out.println(Arrays.toString(arr2));
		int[] newArr = new int[arr2.length - 1];
		int add = 0;
		for (int i = 1; i < arr2.length; i++) {
			newArr[add] = arr2[i];
			add = add + 1;
		}
		System.out.println("first element is elemented :" + Arrays.toString(newArr));
		System.out.println();

		// problem 3
		int[] arr3 = { 5, 2, 1, 17 };
		System.out.println(Arrays.toString(arr3));
		int[] newarr3 = new int[arr3.length + 1];
		int add3 = 1;
		newarr3[0] = 0;
		for (int i = 0; i < arr3.length; i++) {
			newarr3[add3] = arr3[i];
			add3++;
		}
		System.out.println("first element is always zero :" + Arrays.toString(newarr3));
		System.out.println();

		// problem 4

		int[] arr4 = { 4, 1, 7, 9 };
		System.out.println(Arrays.toString(arr4));
		int[] newarr4 = new int[2 * arr4.length];
		int add4 = arr4.length;
		for (int i = 0; i < arr4.length; i++) {
			int num = arr4[i];
			newarr4[i] = num;
			newarr4[add4 + i] = num;
		}
		System.out.println("doubling the array element :" + Arrays.toString(newarr4));
		System.out.println();

		// problem 5
		int[] arr5 = { 4, 12, 13, 16 };
		System.out.println(Arrays.toString(arr5));
		int[] newarr5 = new int[2 * arr5.length];
		int add5 = 0;
		for (int i = 0; i < arr5.length; i++) {
			int num = arr5[i];
			newarr5[add5] = num;
			add5++;
			newarr5[add5] = num;
			add5++;
		}
		System.out.println("duplicateing every elements: " + Arrays.toString(newarr5));
		System.out.println();

		// problem 6
		int[] arr6 = { 34, 2, 43, 15 };
		System.out.println(Arrays.toString(arr6));
		int temp1 = arr6[0], temp2 = arr6[0], min = 0, max = 0;
		for (int i = 1; i < arr6.length; i++) {
			max = arr6[i];
			if (temp1 < max) { // 2nd is bigger than first --> then change the first one with the second one
				temp1 = max;
			}
			min=arr6[i];
			if (temp2 > min) { // 2nd is smaller than first --> then change the first one with the second one
				temp2=min;
			}
		}System.out.println("difference between biggest and the smallest element in the arrays : "+(temp1-temp2));

	}

}
