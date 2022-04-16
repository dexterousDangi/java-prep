import java.util.Scanner;

public class String_Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the string or any no. , you want to check whether it is a palindrome or not");
		String str = sc.nextLine();
		sc.close();

		StringBuffer stb = new StringBuffer(str); // converting string into stringBuffer so that operation can be
													// performed on this

		StringBuffer strb = stb.reverse();
		System.out.println("reverse of the given string :");
		System.out.println(strb);
		String str1 = strb.toString();      // converting stringbuffer into string back
		
		if (str.equals(str1) != false)
			System.out.println("string or number enter is palindrome");
		else
			System.out.println("not a palindrome");
		
		System.out.println("again checking if there is some upper case or lower case problem");
		
		if(str.equalsIgnoreCase(str1))
			System.out.println(" is a palindorme and cases are ignored");
		else
			System.out.println("not a palindrome");
		// another way to check  the palindrome
		checkPalindrome(str);
	}

	private static void checkPalindrome(String str) {
	    String string =str;
	    String strg ="";
	    char c ;
	    for(int i=string.length()-1;i>=0;i--) {
	    	c= string.charAt(i);
	    	strg =strg +c;
	    }
	    System.out.println("againg a new way to reverse a string \n "+ strg);
	if(string.equals(strg)!=false)
		System.out.println("it is a palindrome");
	else
		System.out.println("not a palindrome");
	}

}
