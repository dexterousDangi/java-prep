package collection.application;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_collection {

// set is also a collection sub interface which implements collection interface
// In set , null insertion is allowed only once because in set object duplication is not allowed
	// in set insertion order is not preserved except linked hashset.
	// treeset is used to store the data in sorted order because it implements the
	// sorted set interface.
	// doesn't provide thread safety.
	// it allows the heterogenous data to be entered except tree set.
	// tree set doesn't allowed the null insertion.

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>(); // hashset underlying data structure is Hash Table
		hs.add(21);
		hs.add(53);
		hs.add(34);
		hs.add(435);
		hs.add(null);
		hs.add(null);
		hs.add(21);
		hs.add(Integer.valueOf(35));

		System.out.println("size of hashset : " + hs.size());

		Iterator<Integer> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println();

		HashSet<Object> h = new HashSet<>(hs);
		h.add("deni");
		h.add(new Team("leo", 30));
		Iterator<Object> it = h.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			if (o instanceof Team) {
				Team t = (Team) o;
				System.out.println(t.goal + "...." + t.player);
			} else {
				System.out.println(o);
			}
		}
		
		
		HashSet<Team> sh= new HashSet<Team>();
		sh.add(new Team("mwo",34));
		sh.add(new Team("zita",24));
		sh.add(new Team("wo",36));
		sh.add(new Team("mo",3));
		sh.add(new Team("eto",40));
		System.out.println("size of hashset :"+ sh.size());
		Iterator<Team> ir =sh.iterator();
		while(ir.hasNext()) {
			Team tt= ir.next();
			System.out.println(tt.goal+"..."+tt.player);
			if((tt.player).equals("mwo")) {
				ir.remove();
			}
		}System.out.println(sh.size()+"  : size of hashset");
	

		LinkedHashSet<String> ts = new LinkedHashSet<String>();  // preserves the insertion order and all other operations are same as hashset.
		ts.add("nwo");
		ts.add("mata");
		ts.add("mayo");
		ts.add("lao");
		ts.add("amio");
		System.out.println(ts); 
	}

}
