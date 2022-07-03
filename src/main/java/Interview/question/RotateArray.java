package Interview.question;

import java.util.Arrays;

public class RotateArray {

	public static void rotate(int[] nums, int k) {
		if (k > nums.length) {
			k = k % nums.length;
		}

		int[] result = new int[nums.length];

		for (int i = 0; i < k; i++) {   // for the given postion to the end of the array length
			result[i]=nums[nums.length-k+i];
		}
		
		int j=0;
		for(int i=k;i<nums.length;i++) {  // for the remaining elements of the array
			result[i]=nums[j];
			j++;
		}
		
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(result));
		System.arraycopy(result, 0, nums, 0, nums.length);
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {
		int [] nums= {1,2,3,4,5,6};
		int orderChange=3;
		
		rotate(nums,orderChange);
	}

}
