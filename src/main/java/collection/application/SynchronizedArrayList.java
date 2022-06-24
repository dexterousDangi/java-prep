package collection.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Using Collections.synchronizedList()
 */
public class SynchronizedArrayList {

	public static void main(String[] args) {

		  // Converting ArrayList to Synchronized ArrayList
//	       List<String> synchronizedarraylist = 
//	       Collections.synchronizedList(new ArrayList<String>());

		ArrayList<String> list=new ArrayList<String>();
		List<String> synchronizedarraylist=Collections.synchronizedList(list);
		
		
	       //Adding elements to synchronized ArrayList
	       synchronizedarraylist.add("Basketball");
	       synchronizedarraylist.add("Baseball");
	       synchronizedarraylist.add("Football");
	       
	       System.out.println("Synchronized ArrayList Iteration:");
	       synchronized(synchronizedarraylist) {
	       Iterator<String> iterator = synchronizedarraylist.iterator(); 
	       while (iterator.hasNext())
	          System.out.println(iterator.next());
	       }	       
	}

}
