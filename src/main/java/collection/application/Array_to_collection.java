package collection.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_to_collection {

	public static void main(String[] args) {
				
		String [] str= {"charle", "bravo", "alpha","delta"};
		System.out.println(Arrays.toString(str));
		ArrayList<String> ls= new ArrayList<>(Arrays.asList(str));
		ls.add("dangi");
		Collections.sort(ls);
		for(String a: ls)
			System.out.print(" "+a);
		
	}

}
