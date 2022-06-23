package collection.application;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *  Iterating or looping Map Using keySet() and iterator
 */
public class HashMap_Iteration2 {

	public static void main(String[] args) {
		
		HashMap<String, String> hashmap = new HashMap<String, String>();
	    hashmap.put("Messi", "Argentina");
	    hashmap.put("Cristiano", "Portugal");
	    
	    Set<String> set=hashmap.keySet();
	    Iterator<String> itr=set.iterator();
	    
	    while(itr.hasNext()) {
	    	String key=itr.next();
	    	System.out.println(key+ "---->"+ hashmap.get(key));
	    }
	    
	}

}
