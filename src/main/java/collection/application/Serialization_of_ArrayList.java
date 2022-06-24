package collection.application;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialization_of_ArrayList {
	  public static void main(String args[]) throws Exception {
	      // ArrayList object creation
	      ArrayList<String> list = new ArrayList<>();
	      
	      // Adding elements to the ArrayList object 
	      list.add("Boston");
	      list.add("Dallas");
	      list.add("New York");
	  
	      
	      /**
	   * 	here the object is written in the binary form in the text file , which later can be deserialized
	   */
	      FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\Microsoft\\Desktop\\writeObject.txt");   
	      ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
	      objectOutputStream.writeObject(list);
	       
	      /**
	       * now just close the stream
	       */
	      objectOutputStream.close();    
	       
	      System.out.println("serialization of object is completed....");
	  
	  }
}
