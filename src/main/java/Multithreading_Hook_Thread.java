//Hook Thread: it is also a normal thread but get executed only prior to jvm is going to shutdown
// it help us to secure our system form data lose

// to make a normal thread hook thread we use "addShutdownHook(Thread_name)" 
// this method is present in the Runitme class, so to call this method we must need instance of 
// Runtime class, and Runtime class instance is available only one perclass ,
// so get that instance using "getRuntime()" method of Runtime class and access the "addShutdownHook()" method.

// Hook Thread always get executed only at the end of the program when just before the jvm shuts doewne

public class Multithreading_Hook_Thread {

	public static void main(String[] args) {

		ShutdownThread hook = new ShutdownThread();   // create a normal thread
		
		
		Runtime r= Runtime.getRuntime();    // get instance of runtime class
		r.addShutdownHook(hook);         // using instance of Runtime class allocate the method , the normal thread 
		
	for(int i=1; i<10; i++) {
		
		  if(i==5) 
		  {System.exit(0);}
		 
			System.out.println(Thread.currentThread().getName());
	}
	}

}
class ShutdownThread extends Thread {
	public void run() {
		System.out.println("hook thread");
	}
}

/*output:
main
main
main
main
hook thread
*/
