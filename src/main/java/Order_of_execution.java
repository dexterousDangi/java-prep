
public class Order_of_execution extends Higher{

	static{
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}
	public Order_of_execution() {
		System.out.println("constructor 0-args");
	}
	public static void main(String[] args) {
		System.out.println("main method :"+Thread.currentThread().getName());
	new Order_of_execution();
	System.out.println("main method :"+Thread.currentThread().getName());
	new Order_of_execution();
	System.out.println("main method :"+Thread.currentThread().getName());
	new Order_of_execution();
	}

}
class Higher{
	static {
		System.out.println("higher class static block");
	}
	{
		System.out.println("higher class instance block");
		
	}
	Higher(){
		System.out.println("higher class constructor");
	}
}