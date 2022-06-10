
public class FinallyBlockExplaination {


//Exceptional handling : try, catch, finally, throw and throwable
//completed topic: try-catch block
//current topic: finally block


//only in 2 cases finally block will not be executed
//first, when we use System.exit(0) method : it will shutdown the JVM, and finally block will not be executed.
//System.exit(0): it is a static method, which is called using the "system" class name.
//second, when exception raised or program terminates "before entering the try block"(finally block 
//is executed only when the control enters into the try block)

//case 1:
/* to execute the programme remove the comments sign from the start and at the end of the application

class Final_notExecuted
{ 
public static void main(String []args)
{

try
{
System.out.println("try block");

System.exit(0);   // whenever complier encounter the "exit(0)" method, Jvm will be shutdown and rest of the code will not be executed. 

}
catch (ArithmeticException ae)
{
System.out.println("catch");
}
finally 
{
System.out.println("finally block");
}
System.out.println("rest of the application");
}
}
*/



//case 2: when exception raised or programme terminets before entering try block
//because finally block is executed only when , the control enters into try block



 
public static void main(String []args)
{
System.out.println("inside main method");

System.out.println(10/0);

         // this statement will raise the exception before entering into the try block
           // hence the finally block will not be executed
try
{
System.out.println("try block");

System.exit(0);   // whenever complier encounter the "exit(0)" method, Jvm will be shutdown and rest of the code will not be executed. 

}
catch (ArithmeticException ae)
{
System.out.println("catch");
}
finally 
{
System.out.println("finally block");
}
}
}

