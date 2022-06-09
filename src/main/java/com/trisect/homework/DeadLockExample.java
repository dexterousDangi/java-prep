package com.trisect.homework;


/**
 *  DeadLock means , lets take an example if we have two resources , resource1 and resource2.
 *  and one thread is accessing resource1 and then resource2 there is some sleep time between them
 *  similarily there is second thread and second thread is accessing resource2 and then resource1 and there is some sleep time between the process
 *  so what will happen, thread1 will try to access resource2, which is hold by thread2 and thread2 try to access the resource1 
 *  this situation is called Deadlock.
 */

public class DeadLockExample {

	public static void main(String[] args) {

		final String resource1="desktop";
		final String resource2="laptop";
		
		
		// using thread class to create a method,and implementing this using anonymous inner class.
		Thread t1= new Thread() {
			public void run() {
				synchronized(resource1) {
					System.out.println(Thread.currentThread().getName()+" : locked "+  resource1);
					try {
						Thread.sleep(1000);
					}catch(Exception e){}
					synchronized(resource2) {
						System.out.println(Thread.currentThread().getName()+" : locked "+resource2);
					}
				}
			}
		};
		t1.setName("Desktop");
		
		// using Runnable interface to creata a thread, and then using thread class to implement the theard, and start it
		Runnable run2=new Runnable() {
			public void run() {
				synchronized(resource2) {
					System.out.println(Thread.currentThread().getName()+" : locked "+  resource2);
					try {
						Thread.sleep(1000);
					}catch(Exception e){}
					synchronized(resource1) {
						System.out.println(Thread.currentThread().getName()+" : locked "+resource1);
					}
				}
			}
		};
		Thread t2=new Thread(run2);
		t2.setName("Laptop");
		
		t1.start();
		t2.start();
		
		
	}

}

// to dealt the situation free one of the resources , means decalre synchronized block seprately for one or thread or both