// like we use synchronized modifier for the methods to avoid data inconsistency, like wise to avoid the 
// data inconsistancey in case of the variable we use volatile modifier for the variables
// because when you declare a variable volatile then a local copy of that variable is made 
// available for each thread and master copy remain intect to avoid variable inconsistency
// and every time that local copy get modified not the master copy of the variable.
public class Volatile_usage {
volatile int a=8;
int b=23;

	public static void main(String[] args) {
		Volatile_usage v=new Volatile_usage();
		Thread t1= new Thread() {
			public void run() {
				v.a=34; 
				 v.b=34;
				System.out.println(v.a+v.b);
			}
		};
		t1.start();
		System.out.println(v.a);  // value of a is not modified because of the usage of the "volatile".
		System.out.println(v.b);   // here b's modified value will be printed
	}

}
