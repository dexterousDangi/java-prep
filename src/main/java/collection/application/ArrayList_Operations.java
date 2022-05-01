package collection.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Operations {

	public static void main(String[] args) {
		List<Hostal> al = new ArrayList<>();
		al.add(new Hostal(1,"laxmi"));
		al.add(new Hostal(2,"arya"));
		al.add(new Hostal(3,"neo"));
		al.add(new Hostal(4,"alpha"));
		System.out.println(al);   
		// or
		Iterator<?> itr = al.iterator();
		while (itr.hasNext()) {
			Object o = (Object) itr.next();
			if (o instanceof Hostal) {
				Hostal hh = (Hostal) o;
				System.out.print(hh.hno + " " + hh.hname+" ");
			}
		
		}System.out.println();
		
		int[] num = new int[al.size()];
		String [] name= new String[al.size()];
		int size1=0,size2=0;
		Iterator<?> itr1 = al.iterator();
		while (itr1.hasNext()) {
			Object o = (Object) itr1.next();
			if (o instanceof Hostal) {
				Hostal hh = (Hostal) o;
				num[size1]=hh.hno;
				name[size2]=hh.hname;
				size1++;
				size2++;
			}
		
		}System.out.println();
				System.out.println(Arrays.toString(num));
				System.out.println(Arrays.toString(name));
		
		al.add(0, new Hostal(0,"newtal"));   // adding some element at said index using add(index, object) method

		System.out.println(al);
		System.out.println("List size: "+al.size());
		System.out.println("is empty: "+al.isEmpty());
		
		al.clear();// to wipeout all the data present in the arraylist
		System.out.println("after clear: "+al);
		System.out.println("is empty: "+al.isEmpty());
	
		ArrayList<Hostal> at = new ArrayList<>();
		at.add(new Hostal(12, "nomad"));
		at.add(new Hostal(2, "pritam"));
		
		al.addAll(at);     // allAll() Method is used to add another collection to current collection
		
		System.out.println(al);
		System.out.println("is empty: "+al.isEmpty());
		System.out.println(al.containsAll(at));
		
	}
}
  
