
public class Singleton implements Cloneable {
     
	private static final Singleton soleInstance =  new Singleton();

	// making our sole constructor private so that no one else will able to create object
	// for our class using a new keyword :
	
	private Singleton() {
		System.out.println("creating ...");
	}
 
	// providing global access point
	public static Singleton getIntsance() { 
		return soleInstance;    // sole instance available
	}
	protected Object clone() throws  CloneNotSupportedException {
		return super.clone();
		
	}
}


class Testclass {
	public static void main(String []args) throws CloneNotSupportedException {
		Singleton s1= Singleton.getIntsance();
		Singleton s2= Singleton.getIntsance();
		
		// check out their hashcode if same then they are pointing to same reference
		print("s1", s1);
		print("s2", s2);
		
		// requirement of single instance can be violated using:
		/*
		 * cloneable
		 * serializable/deserialization
		 * reflection
		 * multithreading access
		 * multiple class loaders
		 * Garbage collection
		 */
		Singleton s3 = (Singleton) s2.clone();
		print("s3",s3);
	}

    static void print(String string, Singleton object) {

    	System.out.println(String.format("Object : %s, Hashcode: %d ", string, object.hashCode()));
	}
}
