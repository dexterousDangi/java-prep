// thread is the light weight program, which is independent of other code/thread running at the same time 
// every thread is initiated by the main thread 
// main thread is first thread which is runned by the jvm , and started at the execution of the main method
// threads mainly throws an error named Interrupted Exception, while using thread class sleep() method, which is used to dealy the process by some miliseconds
// to get the current thread of a class , use currentThread() method of the Thread class,it is a static method.

public class Multithreading_basic {

	public static void main(String[] args) throws InterruptedException {
Thread str= Thread.currentThread();
Thread.sleep(3422);
System.out.println(str);
	}

}
