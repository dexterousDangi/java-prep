import java.util.Arrays;

public class Second_largest_element_in_array {

	public static void main(String[] args) {

		int[] my_array = { 10789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456 };
		System.out.println("Original numeric array : " + Arrays.toString(my_array));
		Arrays.sort(my_array);
		//System.out.println("second largest in array" + my_array[my_array.length-2]);
		
		int index = my_array.length - 1;
		//System.out.println("second largest in array" + my_array[index-1]);
		
		while (my_array[index] == my_array[my_array.length - 1]) {
			index--;  // this will set the index value to second last value.			
		}
		System.out.println("Second largest value: " + my_array[index]);
		System.out.println("second smallest value: " + my_array[1] );
		int a = Integer.MAX_VALUE;
		int b = Integer.MIN_VALUE;
	System.out.format("value of a %d, b %d",a,b);
	
	}

}
// first just sort the array and use the correct index value to find second largest/smallest.