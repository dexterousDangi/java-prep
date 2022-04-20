
public class Multithreading_basic_example {

	public static void main(String[] args) {
         System.out.println(Thread.currentThread());
		Neo n= new Neo();
		n.start();
		//System.out.println(Thread.activeCount());
	}

}
class Neo extends Thread {
	public void run() { 
		Jio j= new Jio();
		j.start();
		System.out.println(Thread.activeCount());
		System.out.println("Neo class thread");
	}
}

class Jio extends Thread {
	public void run() { 
		System.out.println(Thread.activeCount());
		System.out.println("Jio class thread");
	}
}
/*output:   output may differ because thread schedular is a mental patient(consider it as this)
Thread[main,5,main]
3
3
Neo class thread
Jio class thread

*/