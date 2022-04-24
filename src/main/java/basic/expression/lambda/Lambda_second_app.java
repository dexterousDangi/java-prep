// lambda expression also known as the anonymous method, method without name 
// main purpose of the lambda expression is to reduce the length of the code and thus, 
// reduce the length of the byte code

package basic.expression.lambda;

interface It2 {
	void add(int j, int i);
}
public class Lambda_second_app {

	public static void main(String[] args) {
		
		// application with anonymous inner class
		// directly create the object of the interface, it seems to be object but it is not
		// a object of the interface. Internally one implementation class is generated, that class is extending 
		// this interface internally that class object to be created actually.so internally one anonymous inner class
		// is generated, so byte code is also generated.
		
		It2 i= new It2() {

			@Override
			public void add(int j, int i) {
				System.out.println("adding two numbers :" + (i+j));
			}
			
		};i.add(23, 34);
		
		// application with lambda expression with arguments
		
		It2 ii= (int k, int j)-> System.out.println("adding two numbers :" + (k+j));
		ii.add(23, 34);
		
		It2 iii= ( kk, jj)-> System.out.println("adding two numbers :" + (kk+jj));  // specifying the argument type is also not mandatory
		iii.add(23, 34);
	}

}
