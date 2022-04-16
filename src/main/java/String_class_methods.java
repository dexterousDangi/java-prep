import java.util.Scanner;
public class String_class_methods {

	public static void main(String[] args) {
		System.out.println("enter the string :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String strg = str.trim();
		System.out.println(strg);
		
		StringBuffer sb=new  StringBuffer(strg);
		System.out.println(sb.reverse());
		
		
		String [] strn = str.split(" ");
		for(String ss: strn)
			System.out.println(ss);
	}

}
