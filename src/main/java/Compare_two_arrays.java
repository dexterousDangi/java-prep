import java.util.Arrays;

public class Compare_two_arrays {

	public static void main(String[] args) {

		System.out.println("comparing arrays:");
		 
		int [] array1 = {3,32,4,24,5,3,42,4,2};
		int [] array2 = {32,4,2,43,4,42,4,53,5};
		int [] array3 = {3,32,4,24,5,3,42,4,2};
		
		compare_arrays(array1,array2);
		compare_arrays(array3,array2);
		compare_arrays(array1,array3);
		
	}

	public static void compare_arrays(int[] arr1, int[] arr3) {
		boolean equalOrNot = true;
		Arrays.sort(arr1);
		Arrays.sort(arr3);
		
		if(arr1.length == arr3.length) {
	     		for(int i=0; i< arr1.length;i++) {
	     			if(arr1[i] != arr3[i]) {
	     				equalOrNot = false;
	     							}
	     		
	     		}
		}
		else {
			equalOrNot = false;
			
		}
		
		if(equalOrNot) {
			System.out.println(" two arrays are identical");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3));
		
		
		}	else {
		System.out.println("arrays are not identical");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr3));
		
		}
	}

}
