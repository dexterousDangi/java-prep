package collection.application;

import java.util.Arrays;
import java.util.LinkedList;

public class Collection_to_arrays {

	public static void main(String[] args) {
		
		// case 1: when we have a generic collection then only we can directly convert the collection to the corresponding type of array
		
		LinkedList<String> brands =new LinkedList<>();
		brands.add("neo");
		brands.add("jio");
		brands.add("dida");
		brands.add("puma");
		
		String []str= new String [brands.size()];
		System.out.println("prior to conversion "+Arrays.toString(str));
		brands.toArray(str);
		System.out.println("after conversion :"+ Arrays.toString(str));
		
		// if the collection type is not generic then for converting collection to arrays we use Object type of array 
		// which can also hold the heterogenous data too.
		
		ArrayList<?> lst = new Array
	}

}
