
public class HowToGetTheThread_Id {

	public static void main(String[] args) {
		 WorkerThread worker = new WorkerThread();
		 Thread t1=new Thread(worker);
		 t1.setName("first thread");
		 t1.start();
		 
		 //  below is the second constructor : setting name as argument  
		 Thread t2= new Thread(worker,"second Thread");
		 t2.start();
		 
		 Thread t3= new Thread(worker);
		 t3.start();
		 
		 Thread t=Thread.currentThread();
		 System.out.println("name of the main thread: "+t.getName());
		 System.out.println("id of the main thead: "+t.getId());
	}

}
class WorkerThread implements Runnable{
	public void run() {
		Thread t= Thread.currentThread();
		System.out.println("worker thread name: "+t.getName());
		System.out.println("worker thread id: "+t.getId());
		
	}
}