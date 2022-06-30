import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseAnArrayUsingCollectionsClass {
	
	public static void main(String [] args) {
		   String[] inputArray = {"India","USA","Germany","Australia"};
		   System.out.println("Given array: "+Arrays.toString(inputArray));
		   
		   List<String> list = Arrays.asList(inputArray);
		   System.out.println(list);
		   Collections.reverse(list);
		   System.out.println(list);
		   
		   String [] reversedArray=new String[list.size()];
		   list.toArray(reversedArray);
		   
		    System.out.println("Given reversedd array: "+Arrays.toString(reversedArray));
	}
}
