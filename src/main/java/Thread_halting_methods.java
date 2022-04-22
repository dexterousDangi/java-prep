/*
sleep() method : thread goes into sleep stage, thread is stop
wait() method  : here thread is in waiting stage , thread is in running stage.
join() method: current thread will wait until the mentioned thread finishes its execution
yield() method: current thread will wait until the execution will be finished of the same priority thread or the higher priority thread.
interrupt() method: thread has to be in sleep stage or waiting stage to execute this method.
*/
public class Thread_halting_methods  {

	public static void main(String[] args) throws InterruptedException{

		
		Join j= new Join();
		j.start();
		Thread.currentThread().join(1);  //
		// here we are first running user thread but because of the join() method usage main thread will wait 1 milisecond for user defined thread to finish its execution 
       for(int i=1;i<7; i++) {  
    	   System.out.println(Thread.currentThread().getName());
       }
       
       
       Interrupt i = new Interrupt(); 
       i.start();     
       i.interrupt();   // interrupt method responds only when the enters the sleep stage or wait stage
       
       Yield y= new Yield();
       y.start();
       y.yield();   // this thread will also wait until the execution of the main thread finishes.
       for(int i1=1; i1<4; i1++) {
    	   System.out.println(Thread.currentThread().getName());
       }
		
	}

}
class Join extends Thread{
	public void run() {
		
		Thread thread = new Thread();
		try {
			thread.join();   // means this thread will wait until the main thread finishes its 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				for(int i=1 ; i<7; i++) { 			
			System.out.println("this is user defined thread used by join() method");
		}
	}
	
}
class Yield extends Thread {
	public void run() { 
		System.out.println("this method waits until the completion of another thread with same priority or higher");
		Thread.currentThread().setName("yield thread");
		for(int i=1; i<4; i++) { 
			System.out.println(Thread.currentThread().getName());
			
		}
	}
}
class Interrupt extends Thread {
	public void run() {
		System.out.println("Interrupt method call");
		try {
			Thread.sleep(100);
			System.out.println("code inside the try block of interrupt class");
		} catch (Exception e) {
			System.out.println("statement under interrupt class catch block");
		}
	}
	
}

/*output
main
main
main
main
main
main
this is user defined thread used by join() method
this is user defined thread used by join() method
this is user defined thread used by join() method
this is user defined thread used by join() method
this is user defined thread used by join() method
this is user defined thread used by join() method
Interrupt method call
statement under interrupt class catch block
main
main
main
this method waits until the completion of another thread with same priority or higher
yield thread
yield thread
yield thread
*/


