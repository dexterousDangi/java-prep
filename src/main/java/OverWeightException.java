import java.util.Scanner;

// it is a checked exception and of default constructor type
public class OverWeightException extends Exception
{  
	// by extending Exception class it also became a exception class
	// only JVM know about this exception not the complier	
OverWeightException(){}
}

class Using_userdefined_checkedException {
	public static void main(String []args) throws OverWeightException {
		Scanner scan = new Scanner(System.in);
		int weight =0;
		System.out.println("enter you weight");
		weight = scan.nextInt();
	
		scan.close();
		
		if(weight>50)
			System.out.println("stay fit");
		else 
			throw new OverWeightException();
		  // have to use throws as well because complier does'nt know about this exception
		// but jvm do. and we are delegating this exception to the jvm, and it will handle it 
		// by himself.
	
	}
}
/* 
 output:
enter you weight
33
Exception in thread "main" OverWeightException
	at Using_userdefined_checkedException.main(OverWeightException.java:23)

enter you weight
65
stay fit

*/