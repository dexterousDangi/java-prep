// we can also modifiy the name of the names of the user defined thread

public class Multithreading_methods {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Mythread1 m = new Mythread1();
		m.start();
		Mythread1 v = new Mythread1();
		v.start();
		Mythread1 r = new Mythread1();
		r.start();
		
		// to get all the active thread count
		System.out.println("total no of threads alive : "+Thread.activeCount());
		m.currentThread().setName("thead_renamed");
		System.out.println(m.currentThread().getName());
		
		System.out.println("id :"+m.getId() +" "+Thread.currentThread().getName());
				
	}

}
class Mythread1 extends Thread {
	public void run() {
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getName());
	    m1();
	}
	public static void m1() {
		m3();
		System.out.println("m1 method of user defined thread");
	}
	public static void m2() {
		System.out.println("m2 method of user defined thread");
	}
	public static void m3() {
		m2();
		System.out.println("m3 method of user defined thread");
	}
}