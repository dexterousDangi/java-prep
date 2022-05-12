package Interview.question;

import java.util.Arrays;

//Q. Find all pairs of elements whose sum is equal to given number?

public class Find_common_sum_pair {

	public static void findSumPairs(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (key == (arr[i] + arr[j])) {
					System.out.println(key + " selected pair-> " + "( " + arr[i] + " , " + arr[j] + " )");
				}
			}
		}

	}

	public static void main(String[] args) {

		int[] arr = { 3, 4,  434, 23, 24 };
		System.out.println("given array :"+Arrays.toString(arr));
		int sumTocheck = 27;
		findSumPairs(arr,sumTocheck);
	}

}
