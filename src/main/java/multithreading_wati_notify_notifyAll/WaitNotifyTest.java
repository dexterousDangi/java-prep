package multithreading_wati_notify_notifyAll;

public class WaitNotifyTest {

	public static void main(String[] args) {

		Message msg=new Message("Process it");
		Waiter waiter=new Waiter(msg);
		Thread t= new Thread(waiter,"Waiter");
		t.start();
		
		Waiter waiter1=new Waiter(msg);
		Thread t1= new Thread(waiter1,"Waiter1");
		t1.start();
		
		
		Notifier notifier=new Notifier(msg);
		Thread thread=new Thread(notifier,"Notifier");
		thread.start();
		
		System.out.println("All the thread are started...");
	}

}
