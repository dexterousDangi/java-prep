import java.util.ArrayList;

public class Converting_collections_into_Arrays {

	public static void main(String []args)
	{
	     //Generic collection ---> Arrays --->use toArray(T[]) method

	ArrayList<String> a1= new ArrayList<String>();
	a1.add("ram"); 
	a1.add("home");
	a1.add("will");

	String [] s = new String[a1.size()];

	a1.toArray(s);  // it means a1 collection is converted into String[] type array
	for(String ss : s)
	{
	System.out.println(ss);
	}

	      // normal collections----> Arrays----> use toArray() method

	ArrayList<Object> a2 = new ArrayList<>();
	a2.add(23);
	a2.add("jorden");
	a2.add(32.3);

	//a2.toArray(); this will return Object[] type array

	Object [] oo = a2.toArray();

	for(Object o: oo)
	{
	System.out.println(o);
	}
	System.out.println();
	}
}
