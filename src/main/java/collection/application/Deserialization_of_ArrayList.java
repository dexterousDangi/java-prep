package collection.application;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Deserialization_of_ArrayList {

	 public static void main(String args[]) throws Exception {
	      // ArrayList instantiation
	      ArrayList<String> list = new ArrayList<>();
	      FileInputStream fileInputStream =new FileInputStream("C:\\Users\\Microsoft\\Desktop\\writeObject.txt");
	      ObjectInputStream inputStream =new ObjectInputStream(fileInputStream);
	      Object object=inputStream.readObject();
	      list=(ArrayList<String>)object;
	      for(String str: list) {
	    	  System.out.println(str);
	      }
	      
	      System.out.println("Deserialization is done...");
	      inputStream.close();
	 }
}
