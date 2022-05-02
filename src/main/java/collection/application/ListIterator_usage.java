package collection.application;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_usage {

	public static void main(String[] args) {
		Add a1= new Add("sachin", 1);
		Add a2= new Add("sam", 12);
		Add a3= new Add("sachi", 13);
		Add a4= new Add("chin", 156);
		Add a5= new Add("hin", 16);
		Add a6=new Add("neo", 18);			
		List<Add> ls= new LinkedList<>();
		ls.add(a1);
		ls.add(a2);
		ls.add(a3);
		ls.add(a4);
		ls.add(a5);
		System.out.println(((Add)ls.get(0)).aname);  // using get() method to retrive the data 
		System.out.println();
		
		for(Add a:ls) {
			System.out.println(a.aid+"  "+a.aname);
		}
		
		ListIterator<Add> it = ls.listIterator();
		while(it.hasNext()) {
			Add d =it.next();
			if(d.aname=="hin")
				it.remove();
			if(d.aname=="chin")
				it.set(a6);
		}
		System.out.println();
		for(Add a:ls) {
			System.out.println(a.aid+"  "+a.aname);
		}
		
	}

}
class Add{
	String aname;
	int aid;
	Add(String aname, int aid){
		this.aname=aname;
		this.aid=aid;
	}
}