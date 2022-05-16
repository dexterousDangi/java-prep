package Interview.question;

public class Palindrome_check {

	public static void main(String[] args) {
		String str="aebcddcbea";
		int i=0, j=str.length()-1;
		int flag=0;
		while(i<j) {
			if(str.charAt(i++)!=str.charAt(j--)) {
				System.out.println("not a palindrome");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("string is palindrome");
		}
	}

}
