package com.trisect.homework;

import java.util.Arrays;

public class InsertionSortTrisect {

	public static void insertionSort(int[] arr) {  // if confused try to do it using only elements 3,2  
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1; // such that we can leave the already sorted element in the array
			while (j >= 0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
			
		}
	}

	public static void main(String[] args) {
		int[] arr = { 21, 26 , 65, 23, 87, 20 };
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
 