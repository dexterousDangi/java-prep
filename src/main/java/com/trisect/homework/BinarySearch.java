package com.trisect.homework;

// time complexity is O(log n)
// works in case of sorted array only;

public class BinarySearch {
 
	public static int binary(int [] num , int target) {
		int left=0;
		int right=num.length-1;
		while(left<=right) {
			int mid= (left+right)/2;
			if(target==num[mid]) {
				return mid;
			}else if(target > num[mid]) {
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int [] num= {21,43,533,5322,53253,525254234,52352523};
		int target=533;
		if(binary(num,target)>=0) {
			System.out.println("target is at "+binary(num,target)+" index");
		}else {
			System.out.println("target is not present in the array");
		}
	}

}
