package basic.expression.lambda;

public class Thread_using_lambda {

	public static void main(String[] args) {

		Runnable r =() ->{
			System.out.println("thread creation using lambda function");
			for(int i=1; i<=10;i++) {
				System.out.println(Thread.currentThread().getName()+"--"+Thread.currentThread().getPriority()+"..."+i);
			}
		};
		Thread t=new Thread(r);
		t.start();
		for(int i=0; i<5; i++)
			System.out.println(Thread.currentThread().getName()+"..."+i);
		
		
	}

}
