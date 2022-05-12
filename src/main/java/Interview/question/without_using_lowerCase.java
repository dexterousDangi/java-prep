package Interview.question;

//Q. Program to convert  upper to lower case without using toLowercase()?

public class without_using_lowerCase {

	public static void  toLowerCase(String str) {
		char chr = 0;
		for(int i=0;i<str.length();i++) {
			chr=str.charAt(i);
			if(chr>=65 && chr<=90) {
				chr= (char) (chr+32);   // key point of the problem , type cast the asiic value to char
			}	
			
		 System.out.print(chr);
		}
	}
	
	public static void main(String[] args) {
		String str="Hello WORLD";
		System.out.print(str+"--->  ");
		toLowerCase(str);
	}

}
