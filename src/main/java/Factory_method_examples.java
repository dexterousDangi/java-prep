import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Factory methods: methods which returns the object of a class is called factory method,
// these are two types: pre-defined and userdefined factory methods

public class Factory_method_examples {

	public static void main(String []arfs) throws SQLException {
		
		// static factory methods
		Integer i= Integer.valueOf(32);
		Runtime r= Runtime.getRuntime();
		
		// Instance factory methods
		String s= "dangi";
		String ss= s.concat("pardeep");
		
	     // pattern factory method: object of one class provide object of another class
		Integer ii= Integer.valueOf(334);
		String str= ii.toString();  // here we are using method of Integer class and returning object of String class
		
		// some adv. java class and method which are factory methods
		
		Connection cont= DriverManager.getConnection(str);
		 // or
		Statement st= (Statement) cont.createStatement();
		
	}
}
