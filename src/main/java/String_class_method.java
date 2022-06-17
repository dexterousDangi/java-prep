
public class String_class_method {
	public static void main(String []args)
	{
	int[] a = new int[156];
	System.out.println(a.length);

	String s= "pardeep_dangi";
	System.out.println(s.length());


	System.out.println(s.charAt(0));
	System.out.println(s.charAt(8));

	System.out.println(s.indexOf('d'));

	System.out.println(s.lastIndexOf('p'));

	System.out.println(s.contains("e"));
	System.out.println(s.contains("ngi"));

	String st = "afjaghepoi5";
	System.out.println(s.startsWith("afj"));
	System.out.println(st.startsWith("afj"));


	System.out.println(st.endsWith("oi5"));

	System.out.println(st.toUpperCase());

	System.out.println(st.toLowerCase());

	String sb="     danm     ";
	System.out.println(sb.length());
	System.out.println(sb.trim().length());
	System.out.println(sb.trim());

	//String st = "afjaghepoi5";

	System.out.println(st.substring(4));
	System.out.println(st.substring(4,9).length());//  
	}
}
