//Priority of threads means order of execution. It ranges from 1 ot 10
// 10 is the highest and 1 is the lowest
// MIN_PRIORITY means priority is 1
// MAX_PRIORITY means priority is 10
// NORM_PRIORITY means priority is 5

// and by default priority of main thread is 5 and priority of user defined threads is also 5.
// we can set the priority of the threads using setPriority() methods, or
// by using some enum constants 
public class Thread_priority_setting {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.setPriority(1);
		t1.start();
		
		Thread2 t2 = new Thread2();
		t2.setPriority(8);
		t2.start();
		
		
		Thread1 tt1 = new Thread1();
		tt1.setPriority(Thread.MIN_PRIORITY);
		tt1.start();
		
		Thread2 tt2 = new Thread2();
		tt2.setPriority(Thread.MAX_PRIORITY);
		tt2.start();
		
		
		
       
	}

}
class Thread1 extends Thread{
	
	public void run() {
		System.out.println("thread1 class thread");
	}
	 
}

class Thread2 extends Thread {
	public void run() {
		System.out.println("thread2 class thread");
	}
}