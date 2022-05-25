package com.trisect.homework;

public class LinearSearch {
	
		public static int binary(int [] num, int target) {
			for(int i=0; i<num.length;i++) {
				if(num[i]==target) {
					return i;
				}
				
			}
			return -1;
		}
	public static void main(String[] args) {
			int [] num= {12,4324,42,31,51,4,214,2151,212,122};
			int target=41;
			if(binary(num,target)>=0) {
			System.out.println("element is present at the "+binary(num,target)+ " index");
			}else {
				System.out.println("target is not present in the array");
			}
	}

}
