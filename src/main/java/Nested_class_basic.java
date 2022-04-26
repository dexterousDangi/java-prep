
public class Nested_class_basic {
	int a=10, b=10;
	void disp() {
		System.out.println("display method outer class method ");
	}
	class Inner{
		int c=10, d=10;
		void display() {
			System.out.println(" display method inner class method ");
		}
		
		}
	public static void main(String [] args) {
		Nested_class_basic nc= new Nested_class_basic();
		Nested_class_basic.Inner inner = nc.new Inner();
		nc.disp();
		inner.display();
		int add = nc.a+nc.b+inner.c+inner.d;
		System.out.println("adder :"+add);
	}

}
