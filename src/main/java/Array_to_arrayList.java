import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_to_arrayList {

	public static void main(String[] args) {
		  String[]  my_array = new String[] {"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
		  System.out.println(Arrays.toString(my_array));
		  
		  List<String> al	= Arrays.asList(my_array);
		  ArrayList<String>  list = new ArrayList<String>(al);
		  
		  System.out.println(list);
		  Collections.sort(list);
		  System.out.println(list);
	}

}
