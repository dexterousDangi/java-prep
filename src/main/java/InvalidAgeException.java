// declaring user defined checked exception with default and parameterized constructor
import java.util.InputMismatchException;
import java.util.Scanner;

public class InvalidAgeException extends Exception {
	InvalidAgeException (){}   // default constructor
	InvalidAgeException (String str) {   // parameterized constructor
		super(str);
	}
}


class Using_checked_exception {
	
	public static void main(String [] args) throws Exception {
		System.out.println("enter your age to check the validation for Marriage Act");
		Scanner sc = new Scanner(System.in);
	
			int num = sc.nextInt();
		sc.close();
		ageValidation(num);
		
	}

	private static void ageValidation(int no) throws InvalidAgeException {
		System.out.println("enter age :" + no);
		int diff=0;
		diff = 18 - no;
		if (no<18) {
			System.out.println("Not a valid age for age, wait for " + diff + "years");
			throw new InvalidAgeException("enter age is below 18 yr");
			
		} else {
			System.out.println("allowed for Marriage");
		}
	}
}
/*output:

enter your age to check the validation for Marriage Act
36
enter age :36
allowed for Marriage

enter your age to check the validation for Marriage Act
12
enter age :12
Not a valid age for age, wait for 6years
Exception in thread "main" InvalidAgeException: enter age is below 18 yr
	at Using_checked_exception.ageValidation(InvalidAgeException.java:31)
	at Using_checked_exception.main(InvalidAgeException.java:21)

*/