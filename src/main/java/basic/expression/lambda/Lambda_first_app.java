package basic.expression.lambda;
// introduce in java 8
//lambda expression : works in case of only of functional interface
// functional Interface: interface which contains only one abstract method. 
// before java 8 in an interface only abstract methods were allowed, but
//after java 8 abstract , default as well as static methods are allowed in an interface 
//syntax = (args) -> expression      (in case of only one args)
//syntax = (args) -> {  expression 1
//						expression 2
//						expression 3
//						};	


interface It1 {
	void disp();
}
public class Lambda_first_app {

	public static void main(String[] args) {
      
		// application with anonymous inner class concept
		
		It1 i= new It1() 
				{
				public void disp() {
					System.out.println("using anonymous class concept...");
				}};
				i.disp();
				
		// application using lambda expression 
				It1 i1= () -> System.out.println("using lambda ...");
				i1.disp();
				
				// or when you required multiple expression use "{ };" braces with semicolon
				
				It1 i2= () -> {System.out.println("lambda 1....");
				System.out.println("lambda 2...");
				System.out.println("lambda 3...");
				};
			i2.disp();
	}

}
/*output:
using anonymous class concept...
using lambda ...
lambda 1....
lambda 2...
lambda 3...
*/