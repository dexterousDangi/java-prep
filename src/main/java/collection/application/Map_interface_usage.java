package collection.application;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map_interface_usage {

	public static void main(String[] args) {

		HashMap< String, Integer> hashMap=new HashMap<String, Integer>();
		hashMap.put("leo", 310);
		hashMap.put("ronaldo", 410);
		hashMap.put("dangi",310);
		hashMap.put("nipu", 312);
		
		System.out.println(hashMap);
		
		Set<Entry<String, Integer>> set=hashMap.entrySet();   // entrySet() method return type is Set type
		Iterator<Entry<String, Integer>> itr= set.iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> entry=itr.next();	
			System.out.println(entry);
			System.out.println("key = "+entry.getKey()+","+" value = "+entry.getValue());
		}
		 
		Set<String> st= hashMap.keySet();    // keySet() method return type is set type.
		System.out.println("will give us keyset only : "+st);
		
		Collection< Integer > collection= hashMap.values();  // values() method return type is collection type.
		System.out.println("will give us only value set : "+ collection);

		LinkedHashMap< String, Integer> linkedhashMap=new LinkedHashMap<String, Integer>();
		
		linkedhashMap.putAll(hashMap);          // adding intial hashmap to this linkedhashMap
		
		linkedhashMap.put("leo jr.", 310);
		linkedhashMap.put("ronaldo jr.", 410);
		linkedhashMap.put("dangi jr.",310);
		linkedhashMap.put("nipu jr.", 312);
		
		System.out.println(linkedhashMap);
		System.out.println(linkedhashMap.get("leo jr."));
	}

}
