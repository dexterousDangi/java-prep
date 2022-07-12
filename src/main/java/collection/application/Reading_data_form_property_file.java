package collection.application;

import java.io.FileReader;
import java.util.Properties;

public class Reading_data_form_property_file {
	public static void main(String[] args)throws Exception{  
		   FileReader reader = new FileReader("F:\\eclipse workspace\\java-prep\\src\\main\\java\\collection\\application\\info.properties");  
		   Properties obj_p = new Properties();  
		   obj_p.load(reader);  
		   System.out.println(obj_p.getProperty("user"));  
		   System.out.println(obj_p.getProperty("password"));  
		}
}
