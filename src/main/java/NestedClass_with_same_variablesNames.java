
public class NestedClass_with_same_variablesNames
{
private int a =9, b=89;
void m1()
{
System.out.println("outclass--->" + (a+b));
}

class Inner      // inner class
{
int a=99, b=34;
void m2(int a,int b)    		// Inner class methods can access outer class methods
{
System.out.println("Inner class--->"+ (a+b));
System.out.println(this.a+this.b);  // inner class variables
System.out.println(NestedClass_with_same_variablesNames.this.a + NestedClass_with_same_variablesNames.this.b);   // outer class variables
}
}
public static void main(String [] args)
{ 
new NestedClass_with_same_variablesNames().new Inner().m2(3,32);
}
}