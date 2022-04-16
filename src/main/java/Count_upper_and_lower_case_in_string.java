import java.util.Scanner;

public class Count_upper_and_lower_case_in_string {

	public static void main(String[] args) {

		System.out.println("enter the string :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int upr = 0, low = 0;
		char c;
		String uppr = "";
		String lowr = "";
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				uppr = uppr + c;
				upr++;
			} else if (c >= 'a' && c <= 'z') {
				lowr = lowr + c;
				low++;
			}

		}
		System.out.println("no of upper case in the string '" + upr + "' and the latters are as following : " + uppr);
		System.out.println("no of  lower cases in the string' " + low + "'g and the latter are as following : " + lowr);
	}

}
