import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Different_ways_of_input {

	public static void main(String[] args) throws IOException {

		// taking input using BufferedReader class
	 BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in)); 
	 System.out.println("controls are ready enter the input Integers only:");
	 int str= Integer.parseInt(reader2.readLine());
	 System.out.println(str%10);
	 System.out.println(str/10);
	 System.out.println("enter string only:");
	 String st= reader2.readLine();
	 System.out.println("entered string is : "+st);
	 
	 // taking input using scanner class
	 Scanner sc= new  Scanner(System.in);
	 System.out.println("enter Integers only:");
	 int a = sc.nextInt();
	 System.out.println("entered no."+a);
	 
	 System.out.println("enter a single word only:");
	 String s= sc.next(); // will read input only to single space encountered
	 System.out.println("entered word :"+s);
	// sc.close();
	 
//	 // taking input using console class
//	 System.out.println("enter the data:");
//	 Console c= System.console();
//	 String name= c.readLine();
//	 System.out.println("entered data:" +name);
	 	
	 // taking input form DataInputStream Class
	 DataInputStream dis = new DataInputStream(System.in);
	 System.out.println("Enter a value:");
	 String str1 = dis.readLine();
	 System.out.println(str);
	 
	}

}
