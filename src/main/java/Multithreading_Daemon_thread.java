// Daemon thread in Java is a low-priority thread that runs in the background to perform tasks such as garbage collection. 
// if the task complets before the execution of deamon thread exection finishes, then the remaining part will not execute and 
// if main thread or the normal thread take long time enough then both the thread will be executed i.e., main thread and the daemon thread
 
// we have to set a normal thread as Daemon thread using setDaemon(boolean) method of thread class.

public class Multithreading_Daemon_thread {

	public static void main(String[] args) {
		Daemon_thread dt = new Daemon_thread();
		dt.setDaemon(true);
		
		for(int i=1;i<3; i++) {
			System.out.println(Thread.currentThread().getName() + " "+ Thread.currentThread().getId());
		}
		dt.start();
	}

}
class Daemon_thread extends Thread{
	public void run() { 
		Thread.currentThread().setName("daemon thread");
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName()+" <-- is a daemon thread :"+Thread.currentThread().isDaemon());
			
		}
	}
}

/*output:
main 1
main 1
Thread-0 true
Thread-0 true
Thread-0 true
Thread-0 true
Thread-0 true
Thread-0 true
Thread-0 true
*/