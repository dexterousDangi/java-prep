package collection.application;

import java.util.ArrayList;
import java.util.Iterator;


// ArrayList class implements List interface which in turn extends Collection interface
// List interface contains four implementation classes: ArrayList, LinkedList, Vector and Stack
// every collection class have their own properties
// ArrayList can be iterated using iterator and list iterator cursors
// used to store heterogenous data
// ArrayList allowed duplicate objects
// Null insertion is allowed in ArrayList
// Insertion order is maintained
// Unsynchronized in nature

public class ArrayList_basic {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>(); // this is generic arraylist means list of only one type
		al.add(null);
		al.add("dangi");
		al.add("dangi");
		al.add("pardeep");
		System.out.println(al); // data can be retrived directly if arraylist contains wrapper class object or
								// String class objects

		ArrayList all = new ArrayList(); // list containing heterogenous data
		all.add(23);
		all.add("dangi");
		all.add(23.4);
		all.add('d');
		all.add(false);
		System.out.println(all); // retreving data directly form arraylist

		ArrayList at = new ArrayList(); // ArrayList storing different objects
		at.add(new Hostal(12, "nomad"));
		at.add(new Hostal(2, "pritam"));
		at.add(new Stand(1, "rama"));
		at.add(new Stand(3, "boy"));

		System.out.println(at);
		for (Object o : at) {
			if (o instanceof Hostal) {
				Hostal h = (Hostal) o;
				System.out.print(h.hno + "..." + h.hname + " ");
			}
			if (o instanceof Stand) {
				Stand s = (Stand) o;
				System.out.print(s.sno + "..." + s.sname + " ");
			}
		}System.out.println();

		ArrayList att = new ArrayList(); // ArrayList storing different objects
		att.add(new Hostal(122, "nomad"));
		att.add(new Hostal(22, "pritam"));
		att.add(new Stand(21, "rama"));
		att.add(new Stand(32, "boy"));

		Iterator<?> itr = att.iterator();
		while (itr.hasNext()) {
			Object o = (Object) itr.next();
			if (o instanceof Hostal) {
				Hostal hh = (Hostal) o;
				System.out.print(hh.hname + " " + hh.hno+" ");
			}
			if (o instanceof Stand) {
				Stand ss = (Stand) o;
				System.out.print(ss.sname + " " + ss.sno+" ");
			}

		}
	}

}

class Hostal {
	int hno;
	String hname;

	Hostal(int hno, String hname) {
		this.hno = hno;
		this.hname = hname;
	}
	public String toString () {
		return hno+ " " +hname;
	}


}

class Stand {
	int sno;
	String sname;

	Stand(int sno, String sname) {
		this.sname = sname;
		this.sno = sno;
	}
}