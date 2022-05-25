 package com.trisect.homework;

import java.util.Arrays;

// time complexity for the selection sort is the O(n^2)
 
public class SelectionSort {

	public static void main(String[] args) {
		 int [] num= {2,1,21,421,4,12431,41,212,0,1};
		 System.out.println(Arrays.toString(num));
		  sort(num);
			 System.out.println(Arrays.toString(num));
	}

	private static void sort(int[] num) {
		
		for(int i=0;i<num.length;i++) {
			int min=i;
			int temp=0;
			for(int j=i;j<num.length;j++) {
				if(num[j]<num[min]) {
					min=j;
				}
			}
			temp=num[min];
			num[min]= num[i];
			num[i]=temp;
		}
	}

}
