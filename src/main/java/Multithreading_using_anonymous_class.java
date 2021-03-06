// using anonymous class for creating thread with the use of an extra class where we write the logic of the thread
// but there is one disadvantage of anonymous class : we can only create one thread with one anonymous class 
// to create the another thread we have to write another anonymous class.

public class Multithreading_using_anonymous_class {
	Thread t3 = new Thread() {
		public void run() {
			System.out.println(Thread.currentThread().getName());
			Thread.currentThread().setName("anonymous thread 3");
			System.out.println(Thread.currentThread().getName());
		}
	};

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
				Thread.currentThread().setName("anonymous thread 1");
				System.out.println(Thread.currentThread().getName());
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
				Thread.currentThread().setName("anonymous thread 2");
				System.out.println(Thread.currentThread().getName());
			}
		};
		t1.start();
		t2.start();

		Multithreading_using_anonymous_class mb = new Multithreading_using_anonymous_class();
		
		mb.t3.start();   // when thread is created in instance area not in the main method 

		System.out.println("total active thread at the given time: " + Thread.activeCount());
		System.out.println(Thread.currentThread().getName());
	}

}
