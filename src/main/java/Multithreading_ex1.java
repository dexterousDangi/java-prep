
public class Multithreading_ex1 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread());
		Mythread m = new Mythread();
		m.start();	
		// this start() method present in the thread class, and it first 
		// register the thread into the thread schedular , which is responsible for running all the threads
		// after registering the thread it will automatically call the subclass run() method.
		
		// without registering our thread in the schedular it is not possible to run the user defined thread
	
	     Nothread n = new Nothread();
	     n.run();
	     System.out.println(Thread.currentThread()); // acting as main thread not user defined thread
	    
	     Nothread na = new Nothread();
	     na.start();
	      // this is thread 2
	     		// register in the threadschedular with the help of start() method
	     
	
	}

}
class Mythread extends Thread {
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(Thread.currentThread()+" "+i);
		}
	}
}

class Nothread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread());   // acting as main thread not user defined thread
	}
}