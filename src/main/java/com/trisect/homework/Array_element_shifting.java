// shifting a particular numbers at the end or at the starting :
package com.trisect.homework;

import java.util.Arrays;

public class Array_element_shifting {

	public static void main(String[] args) {

		int[] arr = { 23, 24, 24, 52, 5, 24, 5, 24, 24, 5, 3, 5, 63 };
		int len = arr.length;
		int[] newArr = new int[len];
		int[] newarr = new int[len];
		int right = len - 1;
		int left = 0;
		for (int a : arr) // way to print a array using for each loop
			System.out.print(" " + a);
		System.out.println();

		System.out.println(Arrays.toString(arr)); // way to print an array using Arrays class "toString(array_name)"
													// method

		for (int i = 0; i < len; i++) {
			int num = arr[i];
			if (num == 24) {
				newArr[right] = num;
				right--; // moving leftward by 1
			} else {
				newArr[left] = num;
				left++; // moving rightward by 1
			}
		}
		System.out.println("modified array:  shift all the 24's toward right");
		System.out.println(Arrays.toString(newArr));
		System.out.println();

		int rigt = len - 1;
		int lft = 0;
		for (int i = 0; i < len; i++) {
			int num = arr[i];
			if (num == 24) {
				newarr[lft] = num;
				lft++;   //moving rightward by 1
			} else {
				newarr[rigt] = num;
				rigt--;  //moving leftward by 1
			}

		}System.out.println("modified array: shift all the 24's towards left side");
		System.out.println(Arrays.toString(newarr));
	}
}
