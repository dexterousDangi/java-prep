package basic.expression.lambda;
// lambda expression with return type , and writing the "return" keyword is optional

interface food {
	String disp(int a);
}

public class Lambda_third_app {

	public static void main(String[] args) {

		// application with anonymous
		food f1 = new food() {

			@Override
			public String disp(int a) {
				System.out.println("good morning :");
				return "dangi";
			}

		};
		String str1 = f1.disp(12);
		System.out.println(str1);

	// application with lambda expression
		food f2= (a)-> {
			System.out.println("good morning :");
		      return "dangi";
		};
		String str2=f2.disp(32);
		System.out.println(str2);;
	
	// application with lambda
		
		food f3 =(a)-> "dangi";
		String str3=f3.disp(32);
		System.out.println(str3);
	}
}
