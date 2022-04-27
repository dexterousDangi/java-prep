// a inner class declared inside the outer class method is called method local inner class
// can't create a object of method local inner class inside the main method instead we create the object inside the 
// corresponding method and using outer class object we class that class or its methods.

// scope of method local inner class is with in the respective method only
public class Method_local_inner_class {

	void sub() {
		System.out.println("display the substraction of 6433-523 :" + (6433 - 523));
	}

	void special() {
		class Inner {
			void display() {
				System.out.println("display method inside the inner class");
			}
		}
		class Inner1 extends Inner {
			void disp() {
				System.out.println("method inside the child class of the method local inner class");
				Inner in = new Inner();
				in.display();
			}
		}
		Inner in = new Inner();
		in.display();
		Inner1 inn = new Inner1();
		inn.disp();
	}

	public static void main(String[] args) {
		Method_local_inner_class ml = new Method_local_inner_class();
		ml.special();
		ml.sub();
	}

}
