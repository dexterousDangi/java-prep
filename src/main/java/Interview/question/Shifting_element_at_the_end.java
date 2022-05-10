package Interview.question;

import java.util.Arrays;

//Q. Write a java program to Move all zeroes to end of array?

public class Shifting_element_at_the_end {

	public static void pushRight(int []	a) {
		int count=0;
		for(int i=0; i<a.length;i++) { // first set all the non zero elements of the arrays
			if(a[i]!=0)
			a[count++]=a[i];
		}
		while(count<a.length) {   // JUST PUSH zero at the remaining places until the array size is met.
			a[count++]=0;
		}
		
	}
	public static void main(String[] args) {
		
		 int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9}; 
		 System.out.println(Arrays.toString(arr));
		 pushRight(arr);
		 System.out.println(Arrays.toString(arr));
	}

}
