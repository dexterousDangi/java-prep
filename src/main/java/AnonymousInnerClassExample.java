
public class AnonymousInnerClassExample {

Thread t1= new Thread()
{
public void run(){System.out.println("Thread t1 ");}
};

Thread t2= new Thread()
{
public void run(){System.out.println("Thread t2  ");
for(int i=0; i<5;i++)
{try
{t2.sleep(1000);
System.out.println("ohoo");
}

catch(InterruptedException ei)
{System.out.println("na");
}
}
}
};

public static void main(String []args)
{
System.out.println("we are using anonymous inner class and thread together");

AnonymousInnerClassExample tt = new AnonymousInnerClassExample();

tt.t1.run();   // here tt (means outer class) has t(which is having run() method) and which internally having run(), so this is the format of calling run() method.
tt.t2.run();
}
}