import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

	// serialization means writing the object in the network/file format which is supported by system.

public class Serialization_example {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Employee emp = new Employee(112,"dangi");
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("F:\\eclipse workspace\\java-prep\\src\\main\\java\\Serialization.txt"));  // <---- where to write/store the object
																											    // serialization.txt contains object in binary format.
		oos.writeObject(emp);
		oos.close();
		System.out.println("SERIALIZATION COMPLETED");
		}

}   

class Employee implements Serializable {
	int eid;
	String ename;
	Employee (int eid, String ename) {
		this.eid=eid;
		this.ename=ename;
		
	}
}