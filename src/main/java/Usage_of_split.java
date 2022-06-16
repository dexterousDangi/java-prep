
public class Usage_of_split {
	public static void main(String []args)
	{
	String str = " my name is pardeep dangi";

	String [] ss= str.split(" "); // here the delimition is done of single space(when ever complier counter the single space it will sperate the string)
	  
				// string array is printed using for-each loop (which is an array traversing technique) or we can also use simple for loop
		//syntax of for each loop
		//for(array_type newobject_name : array name){}


	for(String sss : ss)
	{
	System.out.println(sss);
	}

	String str1 = " my name is pardeep dangi";

	String [] sr = str1.split("a");  // now split the stirng from every "a"(delimiting form a )

	for(int i=0; i<sr.length; i++)
	{
	System.out.println(sr[i]);
	}
	System.out.println("pardeep".equals("pardeep"));
	System.out.println("Pardeep".equals("pardeep"));
	System.out.println("Pardeep".equalsIgnoreCase("pardeep"));
	}
}
