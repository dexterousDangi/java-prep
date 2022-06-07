package Interview.question;

public class ReverseTwoNumbersWithoutThird {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		System.out.println("a and b before swaping: "+ a+" , "+ b);
		swapTwo(a,b);
	}

	private static void swapTwo(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a and b after swaping: "+ a+ " , "+b);
	}

}
