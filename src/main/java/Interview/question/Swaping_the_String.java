package Interview.question;

//Q. Write a java program to swap two string variables without using temp variable or third variable ?
//A. using substring() and append operations

public class Swaping_the_String {

	public static void main(String[] args) {
		
		String a ="Hello";
		String b = "World";
		System.out.println("before operations : " +a+" , "+b);
		a= a+b;
		System.out.println( "during operations: "+a +"  its size : "+a.length());
		
		b=a.substring(0, a.length()-b.length()); 
		a=a.substring(b.length()); // because that much length is subtracted already
		
		System.out.println("after opertaions : "+ a + " , " +b);
		
	}

}
