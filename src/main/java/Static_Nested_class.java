// a normal inner class can access both static and instance property of the outer class but,
// a static nested class can only access the static property of the outer class

public class Static_Nested_class {

	static void alpha() {
		System.out.println("static method of the outer class");
	}
	
	static  class Inner {
		void m1() {
			System.out.println("method inside the static inner class");
			alpha();
		}
	}
	public static void main(String[] args) {
		new Static_Nested_class.Inner().m1();
	}

}
