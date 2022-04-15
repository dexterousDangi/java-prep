import java.util.Scanner;

public class Less_Then_Six_Feet_Unchecked_Exception extends RuntimeException {
	Less_Then_Six_Feet_Unchecked_Exception() {
	}

	Less_Then_Six_Feet_Unchecked_Exception(String str) {
		super(str);

	}
}

class Usage_Of_Unchecked_Exception {
	public static void main(String[] args) {
		System.out.println("enter you height in centimeters...");
		int height = 0;
		Scanner sc = new Scanner(System.in);
		height = (int) sc.nextFloat();
		sc.close();
		checkHeight(height);

	}

	private static void checkHeight(int height) {
		if (height == 182) {
			System.out.println("your height is exectley 6 ft");
		} else if (height > 182) {
			System.out.println("your height is more then 6 ft" );
		} else {
			throw new Less_Then_Six_Feet_Unchecked_Exception("grow up and it may not be possible after a time");
			// throw new Less_Then_Six_Feet_Unchecked_Exception();
			// both throw statements are correct
		}

	}
}
/*
output:
enter you height in centimeters...
183
your height is more then 6 ft

enter you height in centimeters...
182
your height is exectley 6 ft

enter you height in centimeters...
181
Exception in thread "main" Less_Then_Six_Feet_Unchecked_Exception: grow up and it may not be possible after a time
	at Usage_Of_Unchecked_Exception.checkHeight(Less_Then_Six_Feet_Unchecked_Exception.java:30)
	at Usage_Of_Unchecked_Exception.main(Less_Then_Six_Feet_Unchecked_Exception.java:20)

*/
