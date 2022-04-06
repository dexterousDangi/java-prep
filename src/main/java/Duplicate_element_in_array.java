import java.util.Arrays;

public class Duplicate_element_in_array {

	public static void main(String[] args) {
		int[] my_array = { 32, 535, 64, 34, 64, 25, 34 };
		System.out.println(Arrays.toString(my_array));
		for (int i = 0; i < my_array.length; i++) {
			for (int j = i + 1; j < my_array.length; j++) {
				if (my_array[i] == my_array[j] && i != j) {
					System.out.println("duplicate elements are at index " + i + " and " + j);
					System.out.println("duplicate element is " + my_array[j]);

				}

			}
		}
	}

}
