import java.util.Scanner;
import java.util.StringTokenizer;

public class String_Manipulation_basics {

	public static void main(String[] args) {
		String dd = "dangi";
		String str = "dangi";
		String ddd = new String("dangi");
		String ddd3 = new String("dangi");
		
		System.out.println(ddd==ddd3);   // false
		System.out.println(dd == ddd);    //false
		System.out.println(str == ddd);   //false
		System.out.println(dd == str);       //true
		System.out.println(dd.equals(str));   // true
		System.out.println(dd.equals(ddd));     //true
		System.out.println(ddd3.equals(ddd));   // true
		System.out.println(dd.compareTo(ddd));
		System.out.println(dd.compareTo(str));

		System.out.println();
		System.out.println("given string:");
		
		String stri = "ab cd  ef";
		System.out.println(stri);
		
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(stri, " ");
		for (int i = 0; st.hasMoreTokens(); i++)
			System.out.println("#" + i + ": " + st.nextToken());

		System.out.println();
		
		String[] split = stri.split(" ");
		for (int i = 0; i < split.length; i++)
			System.out.println("#" + i + ": " + split[i]);
		
			System.out.println();

		Scanner sc = new Scanner(stri).useDelimiter(" ");
		
		for (int i = 0; sc.hasNext(); i++)
			System.out.println("#" + i + ": " + sc.next());
		sc.close();
	}

}
/*
 * output:
false
false
true
true
true
0
0
ab cd  ef

#0: ab
#1: cd
#2: ef

#0: ab
#1: cd
#2: 
#3: ef

#0: ab
#1: cd
#2: 
#3: ef

 */