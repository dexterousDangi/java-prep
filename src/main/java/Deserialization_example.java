import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization_example implements Cloneable{

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		
		// deserialization means reading a object from a serialized format 
		// after reading file type cast it into corresponding class of whose object it was
		
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("F:\\\\eclipse workspace\\\\java-prep\\\\src\\\\main\\\\java\\\\Serialization.txt"));
		Employee emp = (Employee) ois.readObject();
		System.out.println(emp.eid+"....."+emp.ename);
		System.out.println("deserialization completed");
			ois.close();
			
	}

}
/*output:
112.....dangi
deserialization completed
*/