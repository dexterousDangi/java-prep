//normal inner class (non-static nested class) can excess private properties of the outer class 
// but static nested class can't access private properties of the outer class.
// outer class methods can be called inside the inner class method but not vice-versa.


public class Inner_class_characterstics {
private int a=20;
private int b=35;
private void disp() {
	System.out.println("outer class private method");
	}
private void add() {
	int c=a+b;
	System.out.println("addition method :"+c);
}
class Inner{
	void inside() {
		add();
		System.out.println(a+b);
	}
	void go_out() {
		System.out.println("inner class second method");
	}
}

	public static void main(String[] args) {
Inner_class_characterstics in= new Inner_class_characterstics();
in.add();
in.disp();
Inner_class_characterstics.Inner inn= in.new Inner();
inn.go_out();
inn.inside();
		
		
	}

}
