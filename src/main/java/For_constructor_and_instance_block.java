
public class For_constructor_and_instance_block {
	For_constructor_and_instance_block() {

		System.out.println("this is zero argument constructor");
	}

	For_constructor_and_instance_block(int a) {
		this();
		System.out.println("this is one argument constructro" + a);
	}
	
	// static block 
	
	static{
		System.out.println("static block 1");
	}
	
	// instance block
	{
		System.out.println("this is instance block 1");
	}
	// second instance block
	{
		System.out.println("this is second instance block");
	}

	public static void main(String[] args) {
		
		System.out.println("main method");
		new For_constructor_and_instance_block(2);
		new For_constructor_and_instance_block();
		
	}

}
/*
 * output:
 *  static block 1 
 *  main method
 *  this is instance block 1
 *  this is second instance block 
 *  this is zero argument constructor
 *  this is one argument constructro2 
 *  this is instance block
 *  1 this is second instance block 
 *  this is zero argument constructor
 */
