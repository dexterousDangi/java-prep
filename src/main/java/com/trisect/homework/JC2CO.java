package com.trisect.homework;

import java.util.Arrays;

public class JC2CO {

	public static void main(String[] args) {
		// problem 2:
		int [] arr= {10,9,12,14,23};
		System.out.println(Arrays.toString(arr));
		System.out.println("printing all the even elements in the array");
		for(int i=0; i<arr.length;i++) {
			int num= arr[i];
			if (num%2==0) {
				System.out.println(num);
			}
		}System.out.println();
		
		// PROBLEM 3
		int [] arr3 = {4,5,8,9,12};
		System.out.println(Arrays.toString(arr3));
		for(int i=0; i<arr3.length;i++) {
			int num=arr3[i];
			if(num%2!=0) {
				arr3[i]=num+1;
			}
		}System.out.println("all odd elements coverted into even :" + Arrays.toString(arr3));
		System.out.println();
		
		
		
		
		
		
	}

}
