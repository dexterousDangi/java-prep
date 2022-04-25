package com.trisect.homework;

import java.util.Arrays;

// file name: JC1CO.PDF
public class On_arrays {

	public static void main(String[] args) {
		// problem 1
		 int [] arr= {4,7,8,9,10};
		 System.out.println("given array :"+Arrays.toString(arr));
		 int sum=0;
		 for(int i=0; i< arr.length; i++) {
			 sum =sum+ arr[i];
		 }System.out.println("sum of all the elements in the array :"+sum);
		System.out.println();
		 
		//problem 2
		int [] arr2= {1,10,12,5,22};
		System.out.println(Arrays.toString(arr2));
		int sum2=0;
		for(int i=0; i<arr2.length;i++) {
			int num= arr2[i];
			if(num>10) {
				sum2= sum2+arr2[i];
			}
		}System.out.println("sum of all the elemetns greater then 10 :"+sum2);
		System.out.println();
		
		// problem 3
		int [] arr3= {1,2,12,5};
		System.out.println(Arrays.toString(arr3));
		int sum3=0;
		for(int i=0; i<arr3.length;i++) {
			int num= arr3[i];
			if(num%2==0) {
				sum3=sum3+arr3[i];
			}
		}System.out.println("sum of the even elements in the arrays : "+sum3);
		System.out.println();
		
		// problem4
		int [] arr4= {12,1,5,8,4,7};
		System.out.println(Arrays.toString(arr4));
		int even=0;
		int odd=0;
		for(int i=0;i<arr4.length;i++) {
			int num=arr4[i];
			if(num%2==0)
				even=even+num;
			else
				odd=odd+num;
		}System.out.println("sum of all the even elements :"+even);
		System.out.println("sum of all the odd elements :"+odd);
		
		
		
		}
		
		
	}

