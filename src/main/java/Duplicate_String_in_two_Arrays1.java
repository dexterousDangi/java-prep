import java.util.Arrays;
import java.util.HashSet;

public class Duplicate_String_in_two_Arrays1 {

	public static void main(String[] args) {
	
			String[] array1 = { "chiku", "aman", "rohan", "ram", "mohan", "ali" };

			String[] array2 = { "rohan", "Aman", "Ali", "dangi", "pinku", "Mohan"  };


			System.out.println("Array1 : " + Arrays.toString(array1));
			System.out.println("Array2 : " + Arrays.toString(array2));

			HashSet<String> set = new HashSet<String>();

			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array2.length; j++) {
					if (array1[i].equals(array2[j])) {
						set.add(array1[i]);
					}
					if (array1[i].equalsIgnoreCase(array2[j])) {
						System.out.println(array1[i] + " is dulpicat of " + array2[j]);
						//System.out.println("the difference is only of cases");
					} 
			}
	
		}
			}
}

