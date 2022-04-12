
public class Singleton {
     
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
}


class Testclass {
	public static void main(String []args) {
		Singleton s1= Singleton.getIntsance();
		Singleton s2= Singleton.getIntsance();
		
		// check out their Hashcode if same then they are pointing to same reference
		print("s1", s1);
		print("s2", s2);
		
	}

    static void print(String string, Singleton object) {

    	System.out.println(String.format("Object : %s, Hashcode: %d ", string, object.hashCode()));
	}
}
/*
creating ...
Object : s1, Hashcode: 366712642 
Object : s2, Hashcode: 366712642 
*/