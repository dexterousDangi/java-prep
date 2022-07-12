package collection.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Making_ArrayList_Unmodifiable {
	public static void main(String[] args) throws Exception

	{
		try {

			// creating object of ArrayList<String>
			List<String> list = new ArrayList<String>();

			list.add("practice");
			list.add("solve");
		    list.add("interview");

			// displaying the initial list
			System.out.println("The initial list is : " + list);

			// using unmodifiableList() method
			List<String> read_only_list = Collections.unmodifiableList(list);

			// displaying the read-only list
			System.out.println("The ReadOnly ArrayList is : " + read_only_list);

			// Trying to add an element to the read-only list
			System.out.println("Trying to modify the ReadOnly ArrayList.");
			read_only_list.add("job");
		}

		catch (UnsupportedOperationException e) {
			System.out.println("The exception thrown is : " + e);
		}
	}
}
