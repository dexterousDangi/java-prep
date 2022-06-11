import java.util.ArrayList;
import java.util.Arrays;

public class Conversion_of_arrays_into_collection_format {
	public static void main(String []args)
	{
	String [] str = {"alpha", "tom", "mac"};  // normal string array

	ArrayList<String> al = new ArrayList<String>(Arrays.asList(str));

	al.add("hoi");
	al.add("hori");

	for (String s: al)
	{
	System.out.println(s);
	}

	ArrayList<String> al1= new ArrayList<>(Arrays.asList(str));  
	al1.add("normal");
	al1.add("arrays");

	for(Object o: al1)
	{
	if(o instanceof String)
	{
	String ss = (String)o;
	System.out.println(ss);
	}
	}
	}
	
}
