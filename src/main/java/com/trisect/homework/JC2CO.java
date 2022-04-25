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
		
		// problem 4
		int [] arr4= {10,28,1,15,-3,3};
		int temp1=arr4[0],temp2=arr4[0], max=0, min=0;
		System.out.println(Arrays.toString(arr4));
		for(int i=1;i<arr4.length; i++) {
			max=arr4[i];
			if(temp1<max) {
				temp1=max;
			}
			min=arr4[i];
			if(temp2>min) {
				temp2=min;
			}
				
			}System.out.println("largest element in the array :"+temp1);
			System.out.println("smallest element in the array :"+temp2);
		
		
		
		
	}

}
