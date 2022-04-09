import java.util.Arrays;

public class Removing_duplicate_within_Array {

	public static void main(String[] args) {

		int [] arr= {23,53,53,2,24,53,2,2,4,66,32,32};
		 int length= arr.length;
		 
		 for(int i= 0; i<length; i++)
		 { 
			 for(int j= i+1; j< length; j++)
			 {
				 if(arr[i] == arr[j])
				 { 
					 arr[j] = arr[length-1];
					 length --; 
					 j--;
					 
				 }
			 }
		 }
		 int [] arr1 = Arrays.copyOf(arr, length);
		 System.out.println(Arrays.toString(arr1));
		 Arrays.sort(arr1);
		 System.out.println(Arrays.toString(arr1));
	}

}
