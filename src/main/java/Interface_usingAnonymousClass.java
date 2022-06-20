interface It1   // by default abstract       [consider it as predefined interface like runable, cloneable]

{
void m1();    // by default public, abstract
void m2();	// by default public, abstract
}


/*
class Test implements It1
{
// override 2 methods here
}

class TestClient 
{
// creating object of test class and calling method inside the main method
}
*/



//eg: usage of anonymous classes  (consider It1 as predefined interface)

public class Interface_usingAnonymousClass
{
It1 t = new It1()   //TestClient$1 this file is overriding these methods internally
{
public void m1()
{System.out.println("m1 method of interface It1 using anonymous inner classes");
System.out.println(t.getClass().getName());
}
public void m2()
{System.out.println("m2 method of interface It1 using anonymous inner classes");
}

/*
internally what is happing: TestClient$1

class TestClient$1 implements It1 {
    public void m1() {
        System.out.println("m1 method of interface It1 using anonymous inner classes");
    }
    
    public void m2() {
        System.out.println("m2 method of interface It1 using anonymous inner classes");
    }
}
*/

};

public static void main(String []args)
{
	Interface_usingAnonymousClass tt = new Interface_usingAnonymousClass();
tt.t.m1();
tt.t.m2();
}
}
