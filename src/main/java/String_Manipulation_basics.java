
public class String_Manipulation_basics {

	public static void main(String[] args) {
		String dd= "dangi";
		String ddd= new String ("dangi");
		String str = "dangi";
		System.out.println(dd==ddd);
		System.out.println(dd==str);
		System.out.println(dd.equals(str));
		System.out.println(dd.equals(ddd));
		System.out.println(dd.compareTo(ddd));
		System.out.println(dd.compareTo(str));
	}

}
/*
output:
false
true
true
true
0
0
*/