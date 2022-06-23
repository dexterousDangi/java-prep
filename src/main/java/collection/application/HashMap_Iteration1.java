package collection.application;

import java.util.HashMap;
import java.util.Set;

/**
 * Iterating or looping Map Using keySet() and foreach loop
 */
public class HashMap_Iteration1 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
	    map.put("maradona", "Argentina");
	    map.put("pele", "Brazil");
	    
	    /**
	     * this will return all the keys as return type.
	     * and by using these keys we can access the Value part. 
	     * that is by using get() method
	     */
	    Set<String> set=map.keySet();
	    
	    for(String key: set	) {
	    	System.out.println(key+"---->"+map.get(key));
	    }
	}

}
