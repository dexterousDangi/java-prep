package collection.application;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Iterating or Looping Map in Java using entrySet() and for each Loop
 */
public class HashMap_Iteration3 {

	public static void main(String[] args) {
		HashMap<String, String> hashmap = new HashMap<String, String>();
	    hashmap.put("Sachin", "India");
	    hashmap.put("Smith", "Australia");
	    
	    /**
	     * Entry contains both the key and value pair together
	     * and can be accessed using getKey() and getValue() method
	     * used with Set object
	     */
	    Set<Map.Entry<String,String>> entry=hashmap.entrySet();
	    for(Map.Entry<String,String> keyvalue:entry) {
	    	System.out.println(keyvalue.getKey()+"---> "+ keyvalue.getValue());
	    }
	}

}
