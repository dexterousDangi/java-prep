package Interview.question;

public class FactorialOfInteger {
static int fact=1;
	public static void main(String[] args) {
	
		int num=5;
		factorial(num);
		System.out.println(factrol(num));
	}

	private static void factorial(int num) {
		if(num==1) {
			System.out.println(fact);
			return;
		}
		fact=fact*num;
		factorial(num-1);
	}

	// both ways are same 
	private static long factrol(int n) {
		if(n==1) {
			return 1;
		}
		return (n*factrol(n-1));
	}
}
