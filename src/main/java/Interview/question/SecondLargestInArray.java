package Interview.question;

import java.util.Arrays;

public class SecondLargestInArray {

	public static void main(String[] args) {
			 int []num= {233,25,252,5,24,12,552,52,525};
			 secondLargest(num);
	}

	private static void secondLargest(int[] num) {
			int max=0;
			int second=0;
		for(int no: num) {
			if(no>max) {
				second=max;
				max=no;
			}else if(no>second) {
				second=no;
			}
		}
		System.out.println("array given"+Arrays.toString(num));
		System.out.println("second largest in the array: "+second);
	}

}
