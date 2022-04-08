
public class For_constructor_and_instance_block {
	For_constructor_and_instance_block() {

		System.out.println("this is zero argument constructor");
	}

	For_constructor_and_instance_block(int a) {
		this();
		System.out.println("this is one argument constructro" + a);
	}

	{
		System.out.println("this is instance block 1");
	}
	{
		System.out.println("this is second instance block");
	}

	public static void main(String[] args) {
		new For_constructor_and_instance_block(2);
		new For_constructor_and_instance_block();
	}

}
/*output:
 this is instance block 1
this is second instance block
this is zero argument constructor
this is one argument constructro2
this is instance block 1
this is second instance block
this is zero argument constructor
*/
