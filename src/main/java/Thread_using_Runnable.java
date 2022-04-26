// When do we use Runnable interface and when do we use Thread class to create the create.
// when we have to perform inheritance we can't extends multiple classes in java , so in the case of 
// inheritance  usage we use Runnable interface to create a thread.and
// when we don't need inheritance and we use Thread class to create a threat.

public class Thread_using_Runnable {

	public static void main(String[] args) {
		
		Thread111 thread1= new Thread111();
		Thread t1=new Thread(thread1);
		t1.start();
		
		Thread222 t2 = new Thread222();
		t2.start();
	}

}

class Thread111 extends com.Inheritance.Parent implements Runnable{
	@Override
	public void run() {
		System.out.println("thread created using Runnable interface");
		
	}} 

class Thread222 extends Thread {
	@Override
	public void run() {
		System.out.println("thread created using Thread class ");
	}
}