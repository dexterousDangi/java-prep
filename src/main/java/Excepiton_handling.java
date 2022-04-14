

import java.util.Scanner;

public class Excepiton_handling {

	public static void throwUsage() {
		int m = 0;
		
		if (m != 0)
			System.out.println("negative vlaue");
		else
			throw new ArithmeticException("enter vlaue less then zero  :"+ m);

		// here throw keyword is used to handover the user created exception object to
		// the jvm. here not the predefined info will printed when an arithmeticException occur
		// instead user defined info will be printed --> saying : enter value less then zero
		// here we just change the info of the predefined method. not of the user defined method.

	}

	public static void main(String[] args)
			throws InterruptedException /* throws keyword usage (to delegate the exception to the jvm to handle it) */ {
		System.out.println(Thread.currentThread());
		Thread.sleep(1200);
		System.out.println(Thread.currentThread());

		String str = "pardeep";
		System.out.println(str.charAt(5));

		// using simple try-catch block:

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = 0;
		try {
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("enter the valid vlaue");
		}

		sc.close();
		// try-catch-finally usage:
		try {
			System.out.println(10 / n);
		} catch (Exception e) {
			System.out.println("ir");
		} finally {
			System.out.println("they say i'm always available");
		}

		throwUsage();

	}

}
