import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Difference_between_HashMap_and_LinkedHashMap {

	public static void main(String []args){
		HashMap<Object,Object> h1 = new HashMap<>();
		h1.put(3, "nimo");
		h1.put(23,"neo");
		h1.put(9,"leso");
		h1.put(13, "rama");
		System.out.println(h1);
		LinkedHashMap <Object,Object>ls= new LinkedHashMap<>();
		ls.put(111, "nei");
		ls.put(2, "moto");
		ls.put(3,"maya");
		ls.put(4, "zaya");

		Set<Entry<Object, Object>> s1=ls.entrySet();
		Iterator<Entry<Object, Object>> itr= s1.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}


		  // removing an entry from the map data.
		//Set s2=ls.entrySet();
		Iterator itr2= (ls.entrySet()).iterator();
		while(itr2.hasNext())
		{
		Map.Entry zz =(Map.Entry)itr2.next();
		int i = (Integer)zz.getKey();
		if(i==4)
		{itr2.remove();}
		else
		{
		System.out.println(zz);
		}
		}


		}
}
