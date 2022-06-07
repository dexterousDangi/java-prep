package Interview.question;

public class IfStringHaveVowels {

	public static void main(String[] args) {
		String str1= "alpHa";
		String str2= "ktm";
		System.out.println(str2.matches("(.*)[aeiou](.*)"));
		System.out.println(str1.matches("(.*)[aeiou](.*)"));
	}

}
