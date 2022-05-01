package collection.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayList_with_ListIterator {

	public static void main(String[] args) {
			
		ArrayList<String> list = new ArrayList<>();
		list.add("mohit");
		list.add("rohan");
		list.add("manan");
		list.add("dangi");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		ListIterator <String>ltr=list.listIterator();
		while(ltr.hasNext()) {
			
			String st= ltr.next();
			if(st== "manan") {
				ltr.set("now");  // will replace manan with now
				ltr.add("neo");  // will add neo into the list
				}
			System.out.println(st);
			
		}
		
		System.out.println(ltr.nextIndex());	
		
		while(ltr.hasPrevious()) {   // first take the cursor to the last index to use the hasPrevious() method
			String str =  ltr.previous();
			System.out.println(str);
		}System.out.println(list);
		System.out.println(ltr.nextIndex());
	}

}
