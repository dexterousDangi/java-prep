
public class OverLoading_Siimple {
	 public void print() {

	        System.out.println("Print method without parameters.");

	    }

	    public void print(String name) {

	        System.out.println("Print method with parameter");

	    }

	    public static void main(String args[]) {

	    	OverLoading_Siimple obj1 = new OverLoading_Siimple();

	        obj1.print();

	        obj1.print("xx");

	    }
}
